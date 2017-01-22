'use strict';
const debug = process.env.NODE_ENV !== "production";
const build = process.env.NODE_ENV === "build";
const webpack = require('webpack');
const HTMLWebpackPlugin = require('html-webpack-plugin');
const CopyWebpackPlugin = require('copy-webpack-plugin');
const path = require('path');
const ExtractTextPlugin = require('extract-text-webpack-plugin');
module.exports = {
    devtool: debug ? "inline-sourcemap" : null,

    entry: {"app": "./frontend/src/app/app.jsx"
    , "styles": "./frontend/src/public/styles/index.scss"},
    module: {
        loaders: [
            {
                test: /\.jsx?$/,
                exclude: /(node_modules)/,
                loader: 'babel-loader',
                query: {
                    presets: ['react', 'es2015', 'stage-0'],
                    plugins: ['react-html-attrs', 'transform-decorators-legacy', 'transform-class-properties'],
                }
            },
            {
                test: /\.scss$/,
                loader: ExtractTextPlugin.extract('style-loader', 'css-loader!resolve-url!sass-loader?sourceMap')
            },
            {test: /\.png$/, exclude: /node_modules/, loader: "url-loader?limit=100000"},
            {test: /\.jpg$/, exclude: /node_modules/, loader: "file-loader"}
        ]
    },
    resolve: {
        extensions: ['', '.jsx', '.js', '.css', '.scss']
    },
    publicPath: '',
    output: {
        path: "./frontend/src/public/scripts",
        filename: "[name].min.js"
    },
    devServer: {
        outputPath: path.join(__dirname, 'build'),
        contentBase: './frontend/src/public',
        port: 3000,
        historyApiFallback: true,
        stats: 'minimal'
    },
    plugins: debug ? [new HTMLWebpackPlugin({
            template: './frontend/src/public/index.html',
            filename: '../index.html'


        }), new CopyWebpackPlugin([{
            from: './frontend/src/public', to: __dirname + '/../dist'
        }]), new webpack.DefinePlugin({
            'process.env': {
                'NODE_ENV': JSON.stringify('production')
            }
        }),  new ExtractTextPlugin('styles.css', {
            allChunks: true
        })] : [

            new webpack.NoErrorPlugin(),
            new webpack.optimize.DedupePlugin(),
            new webpack.optimize.OccurenceOrderPlugin(),
            new webpack.optimize.UglifyJsPlugin({mangle: false, sourcemap: false})
            ,  new ExtractTextPlugin('styles.css', {
                allChunks: true
            })],
};

