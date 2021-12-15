import "./post.css"
import DonateButton from "./DonateButton";

const Post = ({
    id,
    hub_id,
    hub_name,
    post_body,
    hub_location,
    request_id,
    requests_type,
    requests_quantity
}) => {
    return(
        <div className="post-card"> 

        <p>{hub_name}</p>
        <p>location: {hub_location}</p>
        <p className ="post-body">{post_body}</p>
        
        <p>Item needed: {requests_type}</p>
        <p>Quantity needed: {requests_quantity}</p>
        {/* <p>Item needed: {request_type}</p>
        <p> quantity needed: {request_quantity}</p> */}

        <DonateButton id={request_id}/>
        
        </div>
    )
}
export default Post;