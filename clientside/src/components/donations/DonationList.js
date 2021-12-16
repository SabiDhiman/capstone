import Donation from "./Donation";

const DonationList = ({donations}) => {

    const donationComponents = donations.map(donation => {

        return(
            <Donation 
            key = {donation.id}
            quantity = {donation.quantity}
            type = {donation.request.donation_type}
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