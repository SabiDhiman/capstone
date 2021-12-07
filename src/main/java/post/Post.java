package post;

import java.util.Objects;

public class Post {
    private Integer id;
    private Integer hub_id;
    private String postBody;

    public Post(Integer id, Integer hub_id, String postBody) {
        this.id = id;
        this.hub_id = hub_id;
        this.postBody = postBody;
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

    public String getPostBody() {
        return postBody;
    }

    public void setPostBody(String postBody) {
        this.postBody = postBody;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Post post = (Post) o;
        return Objects.equals(id, post.id) && Objects.equals(hub_id, post.hub_id) && Objects.equals(postBody, post.postBody);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, hub_id, postBody);
    }

    @Override
    public String toString() {
        return "Post{" +
                "id=" + id +
                ", hub_id=" + hub_id +
                ", postBody='" + postBody + '\'' +
                '}';

    }
}
