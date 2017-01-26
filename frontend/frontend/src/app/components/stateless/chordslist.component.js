import {ChordsItem} from './chordsitem.component'
import React from "react";
/**
 * @author rlapin
 */




export const ChordsList = ({items}) => {


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