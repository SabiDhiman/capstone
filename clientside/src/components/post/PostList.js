import Post from "./Post"

const PostList = ({posts}) => {


    const postComponents = posts.map(post => {
        return (
            <Post
            id = {post.id}
            hub_id={post.hub_id}
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