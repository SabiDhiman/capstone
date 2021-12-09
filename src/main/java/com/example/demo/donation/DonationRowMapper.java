package com.example.demo.donation;

import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Component;

import java.sql.ResultSet;
import java.sql.SQLException;

@Component
public class DonationRowMapper implements RowMapper<Donation> {
    @Override
    public Donation mapRow(ResultSet rs, int rowNum ) throws SQLException {
        Donation donation = new Donation(
                rs.getInt("id"),
                rs.getInt("user_id"),
                rs.getInt("donation_quantity"),
                rs.getInt("request_id")
        );

        return donation;
    }
}
