import React, {useState, useEffect, useContext} from 'react';
import {useNavigate} from 'react-router-dom'
import { UserContext } from '../UserContext';
import './Login.css'



function LoginPage() {

const {user, login} = useContext(UserContext)
const [formUser, setFormUser] = useState("")
const [formEmail, setFormEmail] =useState("")

const navigate = useNavigate();



async function handleLoginClick()
{
 

  let results = await fetch("http://localhost:8080/user")

  results = await results.json();
  console.log(results)
// console.log("here", id)


  const userInfo = results.filter(result => result.name === formUser && result.email === formEmail)
  console.log(userInfo)

if(userInfo.length !== 0) {

login(userInfo[0])

    navigate("/homePage");
}


}
return (


<div className="login-page">

  <div className="main-container">
 

    <h1>Login</h1>



  <div className = "input-container">

      <input type="text" placeholder="Please enter your username" onChange={(e)=>setFormUser(e.target.value)} className="form-control"/>
    <input type="email" placeholder="Please enter your email" onChange={(e)=>setFormEmail(e.target.value)} className="form-control"/>
  </div>

<div className = "button-container">
  
  <button onClick={async () => handleLoginClick()}>login</button>
 
</div>

  </div>
</div>

);
} 

export default LoginPage;
