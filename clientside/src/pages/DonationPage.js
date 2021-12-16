import { getAllDonations } from '../adapters/backendAdapter';
import DonationList from '../components/donations/DonationList';
import {useState, useEffect} from 'react';
import { UserContext } from '../UserContext';
import { useContext } from 'react';


const DonationPage = () => {

  const {user} = useContext(UserContext);
  const userId = user.id;

  const [donations, setDonations] = useState([]);

  useEffect(()=>{
      getAllDonations().then(response => setDonations(response))
  },[]);

  const filteredDonations = donations.filter(filterDonations);

  function filterDonations(donation){
    if(donation.user_id == userId){
      return(donation)
    }
  }
    

    if(donations.length>0){
        return (
            <div className="donation-page">
              <header className="donation-header">
               Welcome to your donation page {user.name}!
               
                    <DonationList donations={filteredDonations}/>
              
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
