/**
 * Created by rlapin on 11/14/16.
 */
import React from "react";
import ReactDOM from "react-dom";
import {LoginForm, AboutComponent, QueryComponent, Header} from "./components";
import DevTools from "./components/devTools";
import {syncHistoryWithStore} from "react-router-redux";
import configureStore from "./store/configureStore";
import {Provider, connect} from "react-redux";
import {Router, Route, browserHistory} from "react-router";


const isProduction = true;
// Create an enhanced history that syncs navigation events with the store
let store = configureStore();
const history = syncHistoryWithStore(browserHistory, store);
@connect(state=> ({
    auth: state.loginState.auth
}))
class App extends React.Component {



    constructor(props) {
        super(props);
    }

    render() {

        return (

            <div id="app">
                <div>
                    <Header/>
                    {this.props.children}
                </div>
                <div>
                    <DevTools/>
                </div>

            </div>
        )
    };
}

class TestComponent extends React.Component {
    render() {
        return (
            <h1>Hello world</h1>
        )
    }
}
const app = document.getElementById('app');
ReactDOM.render(
    <Provider store={store}>
        <Router history={history}>
            <Route path="/" component={App}>
                <Route path="query" component={QueryComponent}/>
                <Route path="about" component={AboutComponent}/>
                <Route path="login" component={LoginForm}/>
                <Route path="*" component={TestComponent}/>
            </Route>

        </Router>
    </Provider>
    , document.body);