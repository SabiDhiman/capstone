import "./post.css"

const Post = ({
    id,
    hub_id,
    hub_name,
    post_body
}) => {

    return(
        <div className="post-card"> 
        <p>{id}</p>
        <p>{hub_name}</p>
        {/* <p>location</p> */}
        <p className ="post-body">{post_body}</p>
        <p>hub id : {hub_id}</p>

        </div>
    )
}
export default Post;