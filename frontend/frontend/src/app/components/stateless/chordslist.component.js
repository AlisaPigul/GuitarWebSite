import {ChordsItem} from './chordsitem.component'
import React from "react";
import {connect} from "react-redux";
/**
 * @author rlapin
 */




let ChordsList = ({items,dispatch}) => {

    debugger;
    return (
        <table>
            <thead>
            <th>Исполнитель</th>
            <th>Песня</th>
            <th>Сложность</th>
            <th>Строй</th>
            <th>Рейтинг</th>
            <th>Просмотров</th>
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