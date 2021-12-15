import { getRequestById } from "../../adapters/backendAdapter";
import { useState } from "react";
import { addDonation } from "../../adapters/backendAdapter";

const DonateForm = ({id},{hub_name}) => {

    //we need to get hub name and donation_type
    const request = getRequestById(id);

    const[quantity, setQuantity] = useState(null);
    //const [donation_type, setDonation_type] = useState(null);
    const userId = 1;


    const handleFormSubmission = (event) => {
        event.preventDefault();
        const newDonation = {
            user_id: userId,
            donation_quantity: quantity,
            request_id: id,
            request: request
            
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
            <p className="inputTitle"> items to donate: {request.donation_type}</p>

            <p className="inputTitle">how many items can you donate?</p>
            <input type="text" value={quantity} onChange={handleQuantityChange}></input>

            <hr/>
            <input className="submit" type="submit" value="Submit"/>
            
        </form>
        </div>
        </div>

    )
}
export default DonateForm