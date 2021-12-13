import Post from "./Post"
//import {getHubsById} from '../../adapters/BackendAdapter'

const PostList = ({posts}) => {


    //TODO: display requests in post, get hub name, location
    const postComponents = posts.map(post => {

        return (
            <Post
            id = {post.id}
            key={post.id}
            hub_id={post.hub_id}
            hub_location={post.hub.location}
            hub_name= {post.hub.name}
            post_body={post.post_body}
            //requests={post.requests}
             requests_type={post.request.donation_type}
            // requests_quantity={post.request.quantity_needed}
             />
        )
    })




    return(
        <div className="post-list">
        {postComponents}
        <p>hello world: postList</p>
        </div>
    )
}
export default PostList;