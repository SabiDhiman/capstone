

const Donation = ({
    id,
    quantity,
    type
}) => {

    return(
        <div className="donation">
            <div className="donation-container">
            <h1>Thank you for donating!</h1>
            <h2>Quantity: {quantity}</h2>
            <h3>Items: {type}</h3>
            <br/>
            </div>
        </div>
    )

}
export default Donation