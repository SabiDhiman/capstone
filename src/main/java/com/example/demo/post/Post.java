package com.example.demo.post;

import java.util.Objects;

public class Post {
    private Integer id;
    private Integer hub_id;
    private String post_body;

    public Post(Integer id, Integer hub_id, String post_body) {
        this.id = id;
        this.hub_id = hub_id;
        this.post_body = post_body;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getHub_id() {
        return hub_id;
    }

    public void setHub_id(Integer hub_id) {
        this.hub_id = hub_id;
    }

    public String getPost_body() {
        return post_body;
    }

    public void setPost_body(String post_body) {
        this.post_body = post_body;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Post post = (Post) o;
        return Objects.equals(id, post.id) && Objects.equals(hub_id, post.hub_id) && Objects.equals(post_body, post.post_body);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, hub_id, post_body);
    }

    @Override
    public String toString() {
        return "Post{" +
                "id=" + id +
                ", hub_id=" + hub_id +
                ", post_body='" + post_body + '\'' +
                '}';

    }
}
