import { createStore, compose, applyMiddleware} from 'redux';
import { persistState } from 'redux-devtools';
import {appReducer} from '../reducers';
import DevTools from '../components/devTools';
import thunkMiddleware from 'redux-thunk'
import {browserHistory} from "react-router";
import {routerMiddleware} from "react-router-redux";
const historyMiddleware = routerMiddleware(browserHistory);
const enhancer = compose(
    applyMiddleware(thunkMiddleware,historyMiddleware),
    DevTools.instrument(),
    persistState(
        window.location.href.match(
            /[?&]debug_session=([^&#]+)\b/
        )
    )
);

export default function configureStore(initialState) {
    return createStore(appReducer, initialState, enhancer);
}