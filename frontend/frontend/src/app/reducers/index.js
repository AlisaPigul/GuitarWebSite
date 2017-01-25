import {combineReducers} from "redux";
import {loginState} from "./loginReducer";
import {searchState} from "./searchReducer";
import {routerReducer} from "react-router-redux";

/**
 * @author rlapin
 */






export const appReducer = combineReducers({
   loginState,searchState
    ,  routing: routerReducer
});