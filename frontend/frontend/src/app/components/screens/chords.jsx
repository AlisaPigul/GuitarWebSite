import React from "react";
import {ChordsList} from '../stateless/chordslist.component'
/**
 * @author rlapin
 */



export class ChordsScreen extends React.Component{


    render(){
        return (
            <content className="chords-list">
                <ChordsList items={[0,1,2,3,4,5,6,7,8,9]}></ChordsList>
            </content>
        )
    }

}