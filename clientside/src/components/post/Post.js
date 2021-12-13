import "./post.css"

const Post = ({
    id,
    hub_id,
    hub_name,
    post_body,
    hub_location,
    //requests
     request_type,
    // request_quantity
}) => {

    return(
        <div className="post-card"> 

        <p>{hub_name}</p>
        <p>location: {hub_location}</p>
        <p className ="post-body">{post_body}</p>
        
        <p>{request_type}</p>
        {/* <p>Item needed: {request_type}</p>
        <p> quantity needed: {request_quantity}</p> */}

    {/* requests={requestComponents = requests.map(request => {
                type = {request.donation_type}
                quantity = {request.quantity_needed}
            })} */}
       

        </div>
    )
}
export default Post;