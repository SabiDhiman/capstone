

const Post = ({
    id,
    hub_id,
    post_body
}) => {

    return(
        <div className="postCard"> 
        <p>{id}</p>
        {/* <p>location</p> */}
        <p>{post_body}</p>
        <p>hub id : {hub_id}</p>

        </div>
    )
}
export default Post;