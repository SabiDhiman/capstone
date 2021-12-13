package com.example.demo.post;

import com.example.demo.hub.HubDAO;
import com.example.demo.request.RequestDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Component;

import java.sql.ResultSet;
import java.sql.SQLException;

@Component
public class PostRowMapper implements RowMapper<Post> {
    @Autowired
    @Qualifier("hubs")
    HubDAO hubDAO;
    @Qualifier("requests")
    RequestDAO requestDAO;
    @Override
    public Post mapRow(ResultSet rs, int rowNum) throws SQLException{

        Post post = new Post(
                rs.getInt("id"),
                rs.getInt("hub_id"),
                rs.getString("post_body"),
                hubDAO.selectHubById(rs.getInt("id")),
                requestDAO.selectRequestById(rs.getInt("id"))
        );

        return post;
    }
}

