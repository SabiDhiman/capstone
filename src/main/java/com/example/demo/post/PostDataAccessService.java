package com.example.demo.post;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;


@Repository ("posts")
public class PostDataAccessService implements PostDAO {

    @Autowired
    PostRowMapper autowiredRowmapper;

    private JdbcTemplate jdbcTemplate;

    public PostDataAccessService(JdbcTemplate jdbcTemplate) {this.jdbcTemplate = jdbcTemplate;}

    @Override
    public void addPostToDatabase(Post post){
        String sql = """
                INSERT INTO posts(post)
                VALUES (?)""";

        jdbcTemplate.update(sql, post.getPost_body());
    }

    @Override
    public void deletePostFromDatabase(int id) {
        String sql = """
                DELETE FROM posts
                WHERE id =? """;

        jdbcTemplate.update(sql, id);
    }

    @Override
    public void updatePost(int id, Post post) {
        String sql = """
                UPDATE posts SET hub_id = ?, post_body = ? WHERE id = ?;""";

        jdbcTemplate.update(sql, post.getHub_id(), post.getPost_body(), id);
    }



    public List<Post> viewAllPosts(){
        String sql = """
                SELECT * FROM posts;
                """;
//        """
//                SELECT * FROM posts INNER JOIN hubs on posts.hub_id=hubs.id;
//                """;
        return jdbcTemplate.query(sql, autowiredRowmapper);
    }
}


