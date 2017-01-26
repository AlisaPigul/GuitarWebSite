import {combineReducers} from "redux";
import {loginState} from "./loginReducer";
import {searchState} from "./searchReducer";
import {routerReducer} from "react-router-redux";
import {i18nState} from "./i18nReducer";

/**
 * @author rlapin
 */






export const appReducer = combineReducers({
    loginState, searchState, i18nState
    , routing: routerReducer
});