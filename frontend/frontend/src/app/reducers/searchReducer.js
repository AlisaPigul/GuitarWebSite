
import {SEARCH_OFF,SEARCH_ON,SEARCH_END} from "../constants";
/**
 * @author rlapin
 */



const DEFAULT_STATE = {
    on: false,
    results: []
};


export function searchState(state = DEFAULT_STATE, action){
    debugger;
    switch(action.type){
        case SEARCH_ON:
            return Object.assign({},state,{on:true});
        case SEARCH_OFF:
            return Object.assign({},state,{on:false});
        case SEARCH_END:
            return Object.assign({},state,{results: action.results});
        default:
            return state;

    }
}

