package com.example.demo.donation;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;


import com.example.demo.user.User;

import java.util.List;
import java.util.Optional;

@Repository("donations")
public class DonationDataAccessService implements DonationDAO {

    @Autowired
    DonationRowMapper donationRowMapper;

    private org.springframework.jdbc.core.JdbcTemplate jdbcTemplate;

    public DonationDataAccessService(JdbcTemplate jdbcTemplate) {this.jdbcTemplate = jdbcTemplate;}

    @Override
    public List<Donation> selectAllDonations() {
        String sql = """
                SELECT *
                FROM donations;
                """;

        return jdbcTemplate.query(sql, donationRowMapper);
    }

    @Override
    public Optional<Donation> selectDonationByUser(int user_id) {
        String sql = """
                SELECT *
                FROM donations
                WHERE user_id = ?;
                """;
        return jdbcTemplate.query(sql, donationRowMapper, user_id)
                .stream()
                .findFirst();
    }

    @Override
    public int addDonation(Donation donation) {
        String sql = """
                INSERT INTO donations (user_id, donation_quantity, request_id)
                VALUES (?, ?, ?);
                """;
        return jdbcTemplate.update(
                sql,
                donation.getUser_id(),
                donation.getDonation_quantity(),
                donation.getRequest_id());
    }

    @Override//y
    public int deleteDonation(int id) {
        String sql = """
                DELETE FROM donations
                WHERE id = ?;
                """;
        return jdbcTemplate.update(sql, id);
    }

    @Override//y
    public int updateDonation(Integer id, Donation donation) {
        String sql = """
                UPDATE donations
                SET user_id = ?, donation_quantity = ?, request_id = ?
                WHERE id = ?;
                """;
        return jdbcTemplate.update(
                sql,
                donation.getUser_id(),
                donation.getDonation_quantity(),
                donation.getRequest_id(),
                id);
    }



}
