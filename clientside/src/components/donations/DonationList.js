import Donation from "./Donation";

const DonationList = ({donations}) => {

    const donationComponents = donations.map(donation => {

        return(
            <Donation 
            key = {donation.id}
            quantity = {donation.quantity}
             />
        )
    })

    return(

        <>
        {donationComponents}
        </>
    )

}
export default DonationList