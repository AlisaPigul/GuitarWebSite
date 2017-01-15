import {LOGIN_SUCCESS, LOGOUT} from "../constants/loginConstants";
/**
 * @author rlapin
 */



export function successLogin() {
     return {
         type: LOGIN_SUCCESS
     }
}
export function logout() {
    return {
        type: LOGOUT
    }
}
export function login(username,password) {
    return function(dispatch) {
        debugger;
        if (username === password && username === 'admin') {
            return dispatch(successLogin());
        } else {
            return dispatch(logout());
        }
    }
}
