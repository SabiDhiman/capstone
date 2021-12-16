import { getRequestById } from "../../adapters/backendAdapter";
import { useState } from "react";
import { addDonation } from "../../adapters/backendAdapter";
import { UserContext } from '../../UserContext';
import { useContext } from 'react';

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
        <div className="formContainer">
        <div className = "form">
        <form onSubmit={handleFormSubmission}>
            <p className="inputTitle"> items to donate: {item}</p>
            <p className="inputTitle">how many items can you donate?</p>
            <input type="number" value={quantity} onChange={handleQuantityChange} />

            <hr/>
            <input className="submit" type="submit" value="Submit"/>
            
        </form>
        </div>
        </div>

    )
}
export default DonateForm