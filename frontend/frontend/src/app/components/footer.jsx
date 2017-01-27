import React from "react";
import {Icon} from "./stateless/icon.component"
import {connect} from "react-redux";
import {ENG, RUS} from "../constants/i18nConstants";
import {changeLocale} from "../actions/i18Actions";

@connect(store=>({
    locale: store.i18nState.locale,
    locales: store.i18nState.locales
}))
export class Footer extends React.Component{



    render() {
        const {locale} = this.props;
        const {locales} = this.props;
        const {dispatch} = this.props;

        debugger;
        return (
            <footer>
                {locales.map((l)=>{
                    return (
                        <Icon className={locale===l?'active':''}  img={l.toLowerCase()+".png"} onClick={()=>dispatch(changeLocale(l))}/>
                    )
                })}
            </footer>
        )
    }
};



