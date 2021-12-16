import Post from "./Post"
import {getHubsById} from '../../adapters/backendAdapter'
import hubImage from './postImages/hubImage.jpg';
import './PostList.css';

const PostList = ({posts}) => {


    //TODO: display requests in post
    console.log(posts[0].request.donation_type)

    const postComponents = posts.map(post => {

        return (
            <>
            
            <Post
            id = {post.id}
            key={post.id}
            hub_id={post.hub_id}
            hub_location={post.hub.location}
            hub_name= {post.hub.name}
            post_body={post.post_body}
            //requests={post.requests}
            request_id = {post.request.id}
            requests_type={post.request.donation_type}
            requests_quantity={post.request.quantity_needed}
             />
              </>
        )
    })




    return(
        <div className="post-list">
        {postComponents}
        </div>
    )
}
export default PostList;