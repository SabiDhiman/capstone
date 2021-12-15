import { useNavigate, useParams } from 'react-router-dom';
import DonateForm from '../components/form/DonateForm';

const FormPage = (props) => {

    const { id } = useParams();


    return(
        <>
        <p>hello welcome to our form page yay!</p>
        <p>donate page for request {id}</p>
        < DonateForm id={id}/>

        </>
    )


}

export default FormPage