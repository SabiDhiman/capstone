import { getRequestById } from "../../adapters/backendAdapter";
import { useState } from "react";
import { addDonation } from "../../adapters/backendAdapter";

const DonateForm = ({id}) => {

    const request = getRequestById(id);
    const[quantity, setQuantity] = useState(null);

    //the user id below needs to be passed in from context
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