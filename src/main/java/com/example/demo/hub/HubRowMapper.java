package com.example.demo.hub;

import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Component;

import java.sql.ResultSet;
import java.sql.SQLException;

@Component
public class HubRowMapper implements RowMapper<Hub>{
    @Override
    public Hub mapRow(ResultSet rs, int rowNum ) throws SQLException{
        Hub hub = new Hub(
                rs.getInt("id"),
                rs.getString("name"),
                rs.getString("location")
        );
        return hub;
    }
}
