import Post from "./Post"
import {getHubById} from '../Adapters/backendAdapter'

const PostList = ({posts}) => {


    //TODO: display requests in post, get hub name, location
    const postComponents = posts.map(post => {
        const hub = getHubById(post.hub_id)
        const hubName = hub.name;
        return (
            <Post
            id = {post.id}
            key={post.id}
            hub_id={hubName}
            post_body={post.post_body}

             />
        )})


    return(
        <div className="postList">
        {postComponents}
        <p>hello world: postList</p>
        </div>
    )
}
export default PostList;