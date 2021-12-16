import { getAllDonations } from '../adapters/backendAdapter';
import DonationList from '../components/donations/DonationList';
import {useState, useEffect} from 'react';


const DonationPage = () => {

  //need to pass in user id and filter by user

    const [donations, setDonations] = useState([]);

    useEffect(()=>{
        getAllDonations().then(response => setDonations(response))
    },[]);

    

    if(donations.length>0){
        return (
            <div className="donation-page">
              <header className="donation-header">
               Welcome to donation page
               
                    <DonationList donations={donations}/>
              
              </header>
            </div>
          );
       }
        else{
            return (
                <div className="donation-page">
                  <header className="donation-header">
                   uh oh, donation list isn't loading in the donation page
                  
                  </header>
                </div>
              );
            }
    
}

export default DonationPage
