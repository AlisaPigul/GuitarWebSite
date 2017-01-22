import React from "react";
import {login} from "../actions";
import {browserHistory} from "react-router";
import {connect} from "react-redux";

@connect(store=>({
    auth: store.loginState.auth
}))
export class LoginForm extends React.Component {
    constructor(props){
        super(props);
        this.state = {value: ''};
        this.handleLoginChange = this.handleLoginChange.bind(this);
        this.handlePasswordChange = this.handlePasswordChange.bind(this);
        this.handleSubmit = this.handleSubmit.bind(this);


    }

    handleLoginChange(event) {
        this.setState({value: event.target.value});
    }

    handlePasswordChange(event) {
        this.setState({password: event.target.value});
    }

    handleSubmit(event) {
        debugger;
        event.preventDefault();
        this.props.dispatch(login(this.state.value,this.state.password));

    }

    render() {
        if(this.props.auth){
            browserHistory.push("/main")
        }
        return (
            <div id="wrapper" className='visible'>


                <form className="login-form" onSubmit={(event)=>this.handleSubmit(event)}>
                        <div className="close-button" onClick={()=>browserHistory.push("/main")}>X</div>
                        <input type="text"  placeholder="Input your login" value={this.state.value} onChange={this.handleLoginChange}/>
                        <input type="password" placeholder="Input your password" value={this.state.password} onChange={this.handlePasswordChange}/>
                    <input type="submit" value={'Login'}/>
                </form>
            </div>
        )
    }
}
