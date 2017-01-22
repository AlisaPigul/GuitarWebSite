import {SEARCH_OFF, SEARCH_ON, SEARCH_END} from "../constants"
/**
 * @author rlapin
 */


export function turnOnSearch() {
    return {
        type: SEARCH_ON
    }
}
export function turnOffSearch() {
    return {
        type: SEARCH_OFF
    }
}

export function searchEnd(results) {
    return {
        type: SEARCH_END,
        results: results
    }
}


export function searchStart(searchValue) {

    return function (dispatch) {
        const results = ['Кино', 'Король и шут'];
        return dispatch(searchEnd(results));
    }
}
