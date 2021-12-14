import './App.css';
import HomePage from "./pages/Homepage";
import {BrowserRouter, Routes, Route} from "react-router-dom";


function App() {

  return(
    <BrowserRouter>
      <div className="router">
        <header className="App-header">

          <h1>HomePage</h1>
        </header>
        
        <Routes>
          <Route path = "/" element={<HomePage />} />
          {/* <Route path = "/LoginPage" element = {<LoginPage />} />*/}
          {/* <Route path = "/DonationPage" element = {<DonationPage />} />  */}
        </Routes>

      </div>
    </BrowserRouter>
  )
}

export default App;
