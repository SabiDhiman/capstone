package com.example.demo.user;


import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;


import java.util.List;
import java.util.Optional;

@Repository("users")
public class UserDataAccessService implements UserDAO {
    private JdbcTemplate jdbcTemplate;

    public UserDataAccessService(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }


    @Override
    public List<User> selectAllUsers() {
        String sql = """
                SELECT *
                FROM users;
                """;

        return jdbcTemplate.query(sql, new UserRowMapper());

    }

    @Override
    public Optional<User> selectUserById(Integer id) {

        String sql = """
                SELECT *
                FROM users
                WHERE id = ?;
                """;
        return jdbcTemplate.query(sql, new UserRowMapper(), id)
                .stream()
                .findFirst();
    }

    @Override
    public int addUser(User user) {
        String sql = """
                INSERT INTO users (name, email)
                VALUES (?, ?, ?);
                """;
        return jdbcTemplate.update(
                sql,
                user.getName(),
                user.getEmail());

    }

    @Override
    public int deleteUser(int id) {

        String sql = """
                DELETE FROM users
                WHERE id = ?;
                """;
        return jdbcTemplate.update(sql, id);
    }

    @Override//y
    public int updateUser(Integer id, User user) {
        String sql = """
                UPDATE users
                SET post_id = ?, donationType = ?, quantity_needed = ?
                WHERE id = ?;
                """;
        return jdbcTemplate.update(
                sql,
                user.getName(),
                user.getEmail());


    }
}
