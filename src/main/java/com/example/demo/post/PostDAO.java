package com.example.demo.post;

import java.util.List;

public interface PostDAO {

    void addPostToDatabase(Post post);
    void deletePostFromDatabase(int id);
    void updatePost(int id, Post post);
    List<Post> viewAllPosts();
}

