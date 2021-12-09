package com.example.demo.post;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequestMapping("/post")
@RestController
public class PostController {

    private PostService postService;

    @Autowired
    public PostController(PostService postService)
    {this.postService = postService;}

    @PostMapping
    public void addPostToDatabase(@RequestBody Post post){
        postService.addPostToDatabase(post);
    }

    @PutMapping("{id}")
    public void updatePost(@PathVariable("id") int id, @RequestBody Post post){
        postService.updatePost(id, post);
    }

    @GetMapping
    public List<Post> viewAllPosts()
    { return postService.viewAllPosts();}

    @DeleteMapping("{id}")
    public void deletePostFromDatabase(@PathVariable("id") int id) {
        postService.deletePostFromDatabase(id);
    }


}