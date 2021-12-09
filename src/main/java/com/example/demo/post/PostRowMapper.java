package com.example.demo.post;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Component;

import java.sql.ResultSet;
import java.sql.SQLException;

@Component
public class PostRowMapper implements RowMapper<Post> {
    //@Autowired
    @Override
    public Post mapRow(ResultSet rs, int rowNum) throws SQLException{

        Post post = new Post(
                rs.getInt("id"),
                rs.getInt("hub_id"),
                rs.getString("post_body")
        );

        return post;
    }
}

