import React from "react";

import {connect} from "react-redux";
import {turnOnSearch, turnOffSearch,searchStart} from "../actions/";


/**
 * @author rlapin
 */

let Header = ({dispatch, searchOn,searchResults}) => {
    let popup = (searchResults && searchResults.length>0)?<div className="popup">{searchResults}</div>:"";

    function onSearchChange(event) {
        debugger
        dispatch(searchStart(event.target.value));
    }

    let searchField = searchOn ? (
            [
                <input onChange={(event)=>onSearchChange(event)} className='search-field' type="text"/>,
                <i onClick={() => dispatch(turnOffSearch())} className="icon search-icon"></i>,
                <i className="icon advanced-icon"></i>,
                popup
            ]) :
    ( [
        <i onClick={() => dispatch(turnOnSearch())} className="icon search-icon"></i>,
        <i className="icon search-tab"> <span class="tooltiptext">Search chords</span> </i>,
        <i className="icon tags-icon"></i>,
        <i className="icon instruments-icon"></i>,
        <i className="icon material-icon"></i>,
        <i className="icon login-icon"></i>

     ]);
    return (
        <header>
            {searchField}


        </header>
    )
};
function mapStateToProps(state) {
    return {
        auth: state.loginState.auth,
        searchOn: state.searchState.on,
        searchResults: state.searchState.results
    }
}

Header = connect(mapStateToProps)(Header);
export default Header;