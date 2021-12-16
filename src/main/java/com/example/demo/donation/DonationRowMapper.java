package com.example.demo.donation;

import com.example.demo.hub.HubDAO;
import com.example.demo.request.RequestDAO;
import com.example.demo.request.RequestDataAccessService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Component;

import java.sql.ResultSet;
import java.sql.SQLException;

@Component
public class DonationRowMapper implements RowMapper<Donation> {

    @Autowired
    @Qualifier("requests")
    RequestDAO requestDAO;


    @Override
    public Donation mapRow(ResultSet rs, int rowNum ) throws SQLException {
        Donation donation = new Donation(
                rs.getInt("id"),
                rs.getInt("user_id"),
                rs.getInt("donation_quantity"),
                rs.getInt("request_id"),
                requestDAO.selectRequestById(rs.getInt("request_id"))

        );

        return donation;
    }
}
