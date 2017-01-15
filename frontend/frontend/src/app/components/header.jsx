import React from "react";
/**
 * @author rlapin
 */
import {NavigationMenu} from "./navigationMenu";
import {connect} from "react-redux";
import {Link} from "react-router";
import {logout} from "../actions/loginActions";

let Header = ({dispatch, auth}) => {

    return (

        <header>
            <input type="text"/>
            <span><a href="#menu">
                &#9776;
            </a></span>

        </header>
    )
};
function mapStateToProps(state) {
    return {
        auth: state.loginState.auth
    }
}

Header = connect(mapStateToProps)(Header);
export default Header;