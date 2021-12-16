
import {BrowserRouter, Routes, Route} from "react-router-dom";
import './App.css';
import Sidebar from './components/sidebar/Sidebar'
import HomePage from './pages/Homepage'
import LoginPage from "./pages/LoginPage";
import  {UserContext}  from "./UserContext";

import {useState, useContext} from 'react'

function App() {
  const {user} = useContext(UserContext)

  
  return (

    <>
      <BrowserRouter>
    <Sidebar/>
    <Routes>
      
   
   <Route path = "/" element={<HomePage />} />
         
          <Route path = "/loginpage" element = {<LoginPage />} />
         
          </Routes>
        </BrowserRouter>
    
  
    </>
  );
}

export default App;
