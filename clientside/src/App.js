import React from 'react';
import './App.css';

import Sidebar from './components/sidebar/Sidebar'
import HomePage from './pages/Homepage'
import LoginPage from "./pages/LoginPage";
import  {UserContext}  from "./UserContext";
import { BrowserRouter,Routes,Route } from 'react-router-dom';


import FormPage from './pages/FormPage';
import DonationPage from './pages/DonationPage';





import {useState, useContext} from 'react'

function App() {
  const {user} = useContext(UserContext)


  
  return (

          {/* <h1>HomePage</h1> */}
        </header>
        
        <Routes>
          <Route path = "/" element={<HomePage />} />
          <Route path = "/:id/FormPage" element={<FormPage />} />
          {/* <Route path = "/LoginPage" element = {<LoginPage />} />*/}
          <Route path = "/DonationPage" element = {<DonationPage />} /> 
        </Routes>


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
