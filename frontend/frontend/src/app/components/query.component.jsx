import * as React from "react";
/**
 * Created by rlapin on 12/26/16.
 */

export class QueryComponent extends React.Component{
    render(){
        return (
            <div className="queryBuilder">
                <h2>Поля для ввода:</h2>
                <div className="row2x1"><input name="group1" checked="checked" type="radio">По умолчанию</input><input name="group1" type="radio">Полная информация</input></div>
                <h2>Ограничения:</h2>
                <div className="row3x1"><input type="select"/><input type="text"/><button>Добавить условие</button></div>
                <div className="row3x1"><input type="select"/><div className="placeholder"></div><button>Добавить операцию</button></div>
                <h2>Сортировка:</h2>
                <div className="row3x1"><input type="select"/><button>По возрастанию</button><button>По убыванию</button></div>
                <h2>Текущий запрос:</h2>
                <div className="queryText">

                </div>
                <h2>Ответ на запрос:</h2>
            </div>
        )
    }
}