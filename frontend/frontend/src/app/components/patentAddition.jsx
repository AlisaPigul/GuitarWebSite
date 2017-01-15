import * as React from "react";

export class PatentAddition extends React.Component{
    constructor(props) {
        super(props);
    }

    render(){
        return (
            <div className="patentInfo">
                <h2>Найти патент по архивному шифру</h2>
                <div className="findPatent"><input type="text"/><button>Найти</button></div>
            </div>
        )
    }
}