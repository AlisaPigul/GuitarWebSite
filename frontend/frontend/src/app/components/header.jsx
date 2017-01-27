import React from "react";

import {connect} from "react-redux";
import {turnOnSearch, turnOffSearch,searchStart} from "../actions/";

//statless components
import {Icon} from "./stateless/icon.component";
import {push} from "react-router-redux";

/**
 * @author rlapin
 */

const Icons = [{img:"music_note.png",tooltip:"Search chords",url:"chords"},
    {img:"golden_star.png",tooltip:"Search tags",url:"tags"},
    {img:"guitar_level.png",tooltip:"Guitar level",url:"levels"},
    {img:"folder_home.png",tooltip:"Materials",url:"materials"},
    {img:"cloud.png",tooltip:"Top chords",url:"tops"},
    {img:"user_male.png",tooltip:"Login",url:"login"},
];
@connect(state=>({
    auth: state.loginState.auth,
    searchResults: state.searchState.results,
}))
export class Header extends React.Component {
    constructor(props) {
        super(props);
        this.state = {searchOn: false};
    }

    render() {
        const searchResults = this.props.searchResults;
        const searchOn = this.state.searchOn;
        const dispatch = this.props.dispatch;
        let popup = (searchResults && searchResults.length > 0) ? <div className="popup">{searchResults}</div> : "";

        function onSearchChange(event) {
            dispatch(searchStart(event.target.value));
        }

        let searchField = searchOn ? (
                [
                    <input onChange={(event) => onSearchChange(event)} className='search-field' type="text"/>,

                    <Icon onClick={() => this.setState({searchOn: false})} img="search.png"
                          tooltip="Turn off search"></Icon>,
                    <Icon onClick={() => 0} tooltip="Show advanced search" img="advanced.png"></Icon>,
                    popup
                ]) :
            ( [
                <Icon onClick={() => this.setState({searchOn: true})} img="search.png" tooltip="Turn on search"></Icon>,
                Icons.map(v=>{
                    return   <Icon onClick={()=>this.props.dispatch(push("/"+v.url))} img={v.img} tooltip={v.tooltip}/>
                        })

            ]);
        return (
            <header>
                {searchField}


            </header>
        )
    }
};

