const Donation = ({
    id,
    quantity,
    type
}) => {

    return(
        <div className="donation">
            <div className="donation-container">
            <h3>Thank you for donating!</h3>
            <h3>Quantity: {quantity}</h3>
            <h3>Items: {type}</h3>
            <br/>
            </div>
        </div>
    )

}
export default Donation