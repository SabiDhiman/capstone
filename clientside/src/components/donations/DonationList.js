import Donation from "./Donation";

const DonationList = ({donations}) => {

    const donationComponents = donations.map(donation => {

        return(
            <Donation 
            key = {donation.id}
            quantity = {donation.donation_quantity}
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