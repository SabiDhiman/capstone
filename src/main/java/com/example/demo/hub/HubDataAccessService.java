package com.example.demo.hub;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository("hubs")
public class HubDataAccessService implements HubDAO {

    private JdbcTemplate jdbcTemplate;

    public HubDataAccessService(JdbcTemplate jdbcTemplate) {this.jdbcTemplate = jdbcTemplate;}

    @Override
    public List<Hub> selectAllHubs() {
        String sql = """
                SELECT * FROM hubs;
                """;

        return jdbcTemplate.query(sql, new HubRowMapper());
    }

    @Override
    public Optional<Hub> selectHubById(Integer id) {
        String sql = """
                SELECT *
                FROM hubs
                WHERE id = ?;
                """;
        return jdbcTemplate.query(sql, new HubRowMapper(), id)
                .stream()
                .findFirst();
    }



    @Override
    public int addHub(Hub hub) {
        String sql = """
                INSERT INTO hubs (hub_name, location)
                VALUES (?, ?);
                """;
        return jdbcTemplate.update(
                sql,
                hub.getName(),
                hub.getLocation());
    }

    @Override//y
    public int deleteHub(int id) {
        String sql = """
                DELETE FROM hubs
                WHERE id = ?;
                """;
        return jdbcTemplate.update(sql, id);
    }

    @Override
    public int updateHub(Integer id, Hub hub) {
        String sql = """
                UPDATE hubs
                SET hub_name = ?, location = ?
                WHERE id = ?;
                """;
        return jdbcTemplate.update(
                sql,
                hub.getName(),
                hub.getLocation(),
                id);
    }


}
