import PostList from '../components/post/PostList';
import {useState, useEffect} from "react"

import {getAllPosts, getAllHubs} from "../adapters/backendAdapter"
import { useNavigate } from 'react-router-dom';
import { useContext } from 'react';
import { UserContext } from '../UserContext';


const Homepage = () => {

  const {user} = useContext(UserContext)


  const [posts, setPosts] = useState([]);
  const [hubs,setHubs] = useState([]);

  useEffect(()=>{
    getAllPosts().then(response => setPosts(response))
  },[]);

  //  useEffect(()=>{
  //    getAllHubs().then(response => setHubs(response))
  // },[]);


  if(posts.length>0){
    return (
        <div className="App">
          <header className="App-header">
           
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
