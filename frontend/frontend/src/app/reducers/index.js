import {combineReducers} from "redux";
import {loginState} from "./loginReducer";
import {searchState} from "./searchReducer";
/**
 * @author rlapin
 */






export const appReducer = combineReducers({
   loginState,searchState
});