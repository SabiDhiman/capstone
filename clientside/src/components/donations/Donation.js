const Donation = ({
    id,
    quantity
}) => {
    
    return(
        <div className="donation">
            <p>Thank you for donating!</p>
            <p>Quantity: {quantity}</p>


        </div>
    )

}
export default Donation