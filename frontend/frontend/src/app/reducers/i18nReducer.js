/**
 * @author rlapin
 */
import {ENG,CHANGE_LOCALE,GET_DICTIONARY} from "../constants/i18nConstants";




const DEFAULT_STATE = {
    locale: ENG,
    dict: {},
};


export function i18nState(state = DEFAULT_STATE, action){
    switch(action.type){
        case GET_DICTIONARY:
            return Object.assign({},state,{dict:action.data,locale:action.locale});
        default:
            return state;

    }
}
