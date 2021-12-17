import { getRequestById } from "../../adapters/backendAdapter";
import { useState } from "react";
import { addDonation } from "../../adapters/backendAdapter";
import { UserContext } from '../../UserContext';
import { useContext } from 'react';
import './DonateForm.css'

const DonateForm = ({id},  {item}) => {

    //const request = getRequestById(id);

    const[quantity, setQuantity] = useState(0);

    
    const {user} = useContext(UserContext);


    const handleFormSubmission = (event) => {
        event.preventDefault();
        const newDonation = {
            user_id: user.id,
            donation_quantity: quantity,
            request_id: id
            
        };   
        addDonation(newDonation);
    }

    

    const handleQuantityChange = (event) =>{
        setQuantity(event.target.value);
    };

    

    return(
    <div className="donation-form-page">

        <div className="main-container">

            <h2>Donation Form</h2>

            <div className = "form-container">
        
              

                    <form onSubmit={handleFormSubmission}>

                            <div className="input-title1">
                            <p className="inputTitle"> items to donate: {item}</p>
                            </div>

                            <div className="input-title2">
                            <p className="inputTitle">how many items can you donate?</p>
                            </div>

                            <div className = "input-container">
                            <input type="number" value={quantity} onChange={handleQuantityChange} />
                            </div>
                    
                            <div className = "button-container">
                            <button type="submit" value="Submit">Submit</button>
                            </div>
                    </form>
            </div>
        </div>
    </div>

    )
}
export default DonateForm