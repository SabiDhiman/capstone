
import {BrowserRouter, Routes, Route} from "react-router-dom";
import './App.css';
import Sidebar from './components/sidebar/Sidebar'
import HomePage from './pages/Homepage'

function App() {
  return (

    <>
      <BrowserRouter>
    <Sidebar/>
    <Routes>
    <Route path = "/" element={<HomePage />} />
          {/* <Route path = "/:id/FormPage" element={<FormPage />} /> */}
          {/* <Route path = "/LoginPage" element = {<LoginPage />} />*/}
          {/* <Route path = "/DonationPage" element = {<DonationPage />} />  */}
          </Routes>
        </BrowserRouter>
    
  
    </>
  );
}

export default App;
