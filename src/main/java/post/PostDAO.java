package post;

import java.util.List;
import java.util.Optional;

public interface PostDAO {

    void addPostToDatabase(Post post);
    void deletePostFromDatabase(int id);
    void updatePost(int id, Post post);
    List<Post> viewAllPosts();
}

