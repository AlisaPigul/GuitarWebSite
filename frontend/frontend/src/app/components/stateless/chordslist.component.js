import {ChordsItem} from './chordsitem.component'
import React from "react";
import {connect} from "react-redux";
/**
 * @author rlapin
 */




let ChordsList = ({items,dispatch,dict}) => {

    debugger;
    return (
        <table>
            <thead>
            <th>{dict.ARTISTS}</th>
            <th>{dict.SONGS}</th>
            <th>{dict.DIFFICULTY}</th>
            <th>{dict.TUNING}</th>
            <th>{dict.RATING}</th>
            <th>{dict.VIEWS}</th>
            </thead>
            <tbody>
            {items && items.map(v => <ChordsItem/>)}
            </tbody>

        </table >
    )
};
const mapStateToProps =(state)=>{
    return {
        dict: state.i18nState.dict
    }
};
ChordsList = connect(mapStateToProps)(ChordsList);
export default ChordsList;