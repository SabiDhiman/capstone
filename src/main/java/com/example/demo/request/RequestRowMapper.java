package com.example.demo.request;


import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Component;

import java.sql.ResultSet;
import java.sql.SQLException;

@Component
public class RequestRowMapper implements RowMapper<Request> {
    @Override
    public Request mapRow(ResultSet rs, int rowNum ) throws SQLException {
        Request request = new Request(
                rs.getInt("id"),
                rs.getInt("post_id"),
                rs.getString("donation_type"),
                rs.getInt("quantity_needed")
        );

        return request;
    }
}
