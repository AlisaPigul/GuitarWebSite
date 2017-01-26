/**
 * @author rlapin
 */
import {GET_DICTIONARY} from "../constants/i18nConstants";


export function changeLocale(locale) {
    let dict = {'author': 'author','songname':'Song name','rating':'Rating'};
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