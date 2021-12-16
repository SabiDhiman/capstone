const Donation = ({
    id,
    quantity,
    type
}) => {

    return(
        <div className="donation">
            <p>Thank you for donating!</p>
            <p>Quantity: {quantity}</p>
            <p>Items: {type}</p>

        </div>
    )

}
export default Donation