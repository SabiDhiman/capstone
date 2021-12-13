package com.example.demo.request;


import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository("requests")
public class RequestDataAccessService implements RequestDAO {

    private JdbcTemplate jdbcTemplate;

    public RequestDataAccessService(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    @Override
    public List<Request> selectAllRequests() {
        String sql = """
                SELECT *
                FROM requests;
                """;

        return jdbcTemplate.query(sql, new RequestRowMapper());
    }

    @Override
    public Optional<Request> selectRequestById(Integer id) {
        String sql = """
                SELECT *
                FROM requests
                WHERE id = ?;
                """;
        return jdbcTemplate.query(sql, new RequestRowMapper(), id)
                .stream()
                .findFirst();
    }

    @Override
    public int addRequest(Request request) {
        String sql = """
                INSERT INTO requests (post_id, donation_type, quantity_needed)
                VALUES (?, ?, ?);
                """;
        return jdbcTemplate.update(
                sql,
                request.getPost_id(),
                request.getDonation_type(),
                request.getQuantity_needed());
    }

    @Override//y
    public int deleteRequest(int id) {
        String sql = """
                DELETE FROM requests
                WHERE id = ?;
                """;
        return jdbcTemplate.update(sql, id);
    }

    @Override//y
    public int updateRequest(Integer id, Request request) {
        String sql = """
                UPDATE requests
                SET post_id = ?, donation_type = ?, quantity_needed = ?
                WHERE id = ?;
                """;
        return jdbcTemplate.update(
                sql,
                request.getPost_id(),
                request.getDonation_type(),
                request.getQuantity_needed(),
                id);


    }

}
