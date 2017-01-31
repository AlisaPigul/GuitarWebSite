/**
 * @author rlapin
 */
import {GET_DICTIONARY, ENG, RUS} from "../constants/i18nConstants";
import {ENG_DICT, RUS_DICT} from "../i18n/dictionary.service";


export function changeLocale(locale) {
    let dict = {'author': 'author','songname':'Song name','rating':'Rating'};
    switch(locale){
        case ENG:
            dict = ENG_DICT;
            break;
        case RUS:
            dict = RUS_DICT;
            break;
        default:
            dict = {}
    }
    return function (dispatch) {
        dispatch(getDictionary(locale, dict));
    }
}
export function getDictionary(locale, dict) {
    return {
        type: GET_DICTIONARY,
        data: dict,
        locale: locale


    }
}