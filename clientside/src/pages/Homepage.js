import PostList from '../components/post/PostList';
import {useState, useEffect} from "react"
import {getAllPosts} from "../Adapters/backendAdapter"
import Post from '../components/post/Post';

const Homepage = () => {

    const [posts, setPosts] = useState([]);

  useEffect(()=>{
    getAllPosts().then(response =>setPosts(response))
  },[]);


  if(posts.length>0){
    return (
        <div className="App">
          <header className="App-header">
           hello world
           
                <PostList posts={posts}/>
        
          
          </header>
        </div>
      );
   }
    else{
        return (
            <div className="App">
              <header className="App-header">
               uh oh, post list isn't loading in the homepage
              
              </header>
            </div>
          );
        }

    }

export default Homepage;
