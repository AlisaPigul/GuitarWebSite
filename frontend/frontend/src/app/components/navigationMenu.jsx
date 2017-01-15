import * as React from "react";
import { Link } from 'react-router'
/**
 * @author rlapin
 */


export class NavigationMenu extends React.Component{
    constructor(props){
        super(props);
        this.state = {
            selected: 0,
            items: [{value:'Главная',link:'main'},{value:'Конструктор запросов',link:'query'},
                    {value:'Классификаторы',link:'classes'},{value:'Об этом проекте',link:'about'}
                     ]
        }
    }
    render(){
        const list = this.state.items.map((val,i)=>
            <div key={i} className="menu-item"><Link to={val.link}>{val.value}</Link></div>
        );
        return (
            <div className="menu">
                {list}
            </div>
        )
    }
}