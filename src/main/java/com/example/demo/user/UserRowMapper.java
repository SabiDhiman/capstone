package com.example.demo.user;


import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Component;

import java.sql.ResultSet;
import java.sql.SQLException;

@Component
public class UserRowMapper implements RowMapper<User> {
    @Override
    public User mapRow(ResultSet rs, int rowNum ) throws SQLException {
        User user = new User(
                rs.getInt("id"),
                rs.getString("user_name"),
                rs.getString("email")
        );

        return user;
    }
}
