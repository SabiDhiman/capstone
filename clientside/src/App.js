import React from 'react';
import './App.css';
import HomePage from "./pages/Homepage";
import FormPage from './pages/FormPage';
import {BrowserRouter, Routes, Route} from "react-router-dom";
import Navbar from './components/navbar';


function App() {

  return(
    <BrowserRouter>
    <Navbar/>
      <div className="router">
        <header className="App-header">

          <h1>HomePage</h1>
        </header>
        
        <Routes>
          <Route path = "/" element={<HomePage />} />
          <Route path = "/:id/FormPage" element={<FormPage />} />
          {/* <Route path = "/LoginPage" element = {<LoginPage />} />*/}
          {/* <Route path = "/DonationPage" element = {<DonationPage />} />  */}
        </Routes>

      </div>
    </BrowserRouter>
  )
}

export default App;
