import { useNavigate, useParams } from 'react-router-dom';
import DonateForm from '../components/form/DonateForm';
import { getRequestById } from "../adapters/backendAdapter";


const FormPage = (props) => {

    const { id } = useParams();

    const request = getRequestById(id)
    const item = request.donation_type;


    return(
        <>
        <p>Hello, welcome to our form page!</p>
        <p>Please donate page for request {id}</p>
        < DonateForm id={id} item ={item}/>

        </>
    )


}

export default FormPage