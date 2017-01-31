import {ChordsItem} from './chordsitem.component'
import React from "react";
import {connect} from "react-redux";
/**
 * @author rlapin
 */




let ChordsList = ({items,dispatch,dict}) => {

    return (
        <table>
            <thead>
            <th className="artists-column">{dict.ARTISTS}</th>
            <th className="songs-column">{dict.SONGS}</th>
            <th className="difficulty-column">{dict.DIFFICULTY}</th>
            <th className="tuning-column">{dict.TUNING}</th>
            <th className="rating-column">{dict.RATING}</th>
            <th className="views-column">{dict.VIEWS}</th>
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