import Post from "./Post"
import {getHubsById} from '../../adapters/BackendAdapter'

const PostList = ({posts,hubs}) => {


    //TODO: display requests in post, get hub name, location
    const postComponents = posts.map(post => {

         let idHub = post.id;
         let thisHub = getHubsById(idHub);
         let hubName = thisHub.name;

        return (
            <Post
            id = {post.id}
            key={post.id}
            hub_id={post.hub_id}
            hub_name= {hubName}
            post_body={post.post_body}

             />
        )
    })

    // const hubComponents = hubs.map(hub => {

    //     return (
    //         <div>
    //             <p>hub:</p>
    //             <p>{hub.id}</p>
    //             <p>hub name</p>
    //             <p>{hub.name}</p>
    //         </div>
    //     )
    // })




    return(
        <div className="post-list">
        {postComponents}
        <p>hello world: postList</p>
        {/* //{hubComponents} */}
        </div>
    )
}
export default PostList;