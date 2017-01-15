import { createStore, applyMiddleware } from 'redux';
import {appReducer} from '../reducers';
import thunkMiddleware from 'redux-thunk'



export default function configureStore(initialState) {
    return createStore(appReducer, applyMiddleware(thunkMiddleware),initialState);
}