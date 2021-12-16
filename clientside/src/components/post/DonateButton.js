import { useNavigate } from "react-router-dom"
import './DonateButton.css'

const DonateButton = ({id}) => {

    let navigate = useNavigate();

    const handleCLick = () =>{

        
        navigate(`/${id}/FormPage`)
    }

    return(
        <div>
        <button onClick={handleCLick} id ={id} className="donateButton">Donate</button>
        </div>
    )
}

export default DonateButton