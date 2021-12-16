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
          <BrowserRouter>
            <Sidebar/>
        <Routes>
          <Route exact path = "/homePage" element={<HomePage />} />
          <Route path = "/:id/formPage" element={<FormPage />} />
          <Route path = "/" element = {<LoginPage />} />
          <Route path = "/donationPage" element = {<DonationPage />} /> 
        </Routes>
        </BrowserRouter>

  );
}

export default App;
