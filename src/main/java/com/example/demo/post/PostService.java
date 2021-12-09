package com.example.demo.post;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PostService {

    private PostDAO postDAO;

    @Autowired
    public PostService(@Qualifier("posts")PostDAO postDAO){
        this.postDAO = postDAO;

    }

    public void addPostToDatabase(Post post){
        postDAO.addPostToDatabase(post);
    }

    public void deletePostFromDatabase(int id){
        postDAO.deletePostFromDatabase(id);

    }

    public void updatePost(int id, Post post){
        postDAO.updatePost(id, post);
    }

    public List<Post> viewAllPosts(){
        return postDAO.viewAllPosts();
    }

}
