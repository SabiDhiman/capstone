import { useNavigate } from "react-router-dom"
import './DonateButton.css'

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