package com.example.demo.post;

import com.example.demo.hub.Hub;
import com.example.demo.request.Request;

import java.util.List;
import java.util.Objects;
import java.util.Optional;

public class Post {
    private Integer id;
    private Integer hub_id;
    private String post_body;
    private Optional<Hub> hub;
    private Optional<Request> request;

    public Post(Integer id, Integer hub_id, String post_body, Optional<Hub> hub, Optional<Request> request) {
        this.id = id;
        this.hub_id = hub_id;
        this.post_body = post_body;
        this.hub = hub;
        this.request = request;
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

    public Optional<Hub> getHub() {
        return hub;
    }

    public void setHub(Optional<Hub> hub) {
        this.hub = hub;
    }

    public Optional<Request> getRequest() {
        return request;
    }

    public void setRequest(Optional<Request> request) {
        this.request = request;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Post post = (Post) o;
        return Objects.equals(id, post.id) && Objects.equals(hub_id, post.hub_id) && Objects.equals(post_body, post.post_body) && Objects.equals(hub, post.hub) && Objects.equals(request, post.request);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, hub_id, post_body, hub, request);
    }

    @Override
    public String toString() {
        return "Post{" +
                "id=" + id +
                ", hub_id=" + hub_id +
                ", post_body='" + post_body + '\'' +
                ", hub=" + hub +
                ", request=" + request +
                '}';
    }
}
