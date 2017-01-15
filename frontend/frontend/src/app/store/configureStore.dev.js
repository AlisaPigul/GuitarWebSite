import { createStore, compose, applyMiddleware} from 'redux';
import { persistState } from 'redux-devtools';
import {appReducer} from '../reducers';
import DevTools from '../components/devTools';
import thunkMiddleware from 'redux-thunk'
const enhancer = compose(
    applyMiddleware(thunkMiddleware),
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