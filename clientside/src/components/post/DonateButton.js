import { useNavigate } from "react-router-dom"

const DonateButton = () => {

    const handleCLick = () =>{

        let navigate = useNavigate;
        navigate('/formPage')
    }

    return(
        <div>
        <button onClick={handleCLick} className="donateButton">Donate</button>
        </div>
    )
}

export default DonateButton