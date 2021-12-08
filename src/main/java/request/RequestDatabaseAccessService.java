package request;

import org.flywaydb.core.internal.jdbc.JdbcTemplate;
import org.flywaydb.core.internal.jdbc.RowMapper;
import org.springframework.stereotype.Repository;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;
import java.util.Optional;

@Repository
public class RequestDatabaseAccessService implements RequestDAO{
    private JdbcTemplate jdbcTemplate;

    public RequestDatabaseAccessService(JdbcTemplate jdbcTemplate){this.jdbcTemplate = jdbcTemplate;}

    RowMapper rowMapper = new RowMapper() {
        @Override
        public Object mapRow(ResultSet rs, int rowNum) throws SQLException {
            Request request = new Request(
                    rs.getInt("id"),
                    rs.getInt("post_id"),
                    rs.getString("donationType"),
                    rs.getInt("quantity_needed"));
            return request;
        }
    };

    @Override
    public List<Request> selectAllRequests() {
        String sql = """
                SELECT *
                FROM requests;
                """;

        return jdbcTemplate.query(sql, rowMapper);
    }

    @Override
    public Optional<Request> selectRequestById(Integer id) {
        String sql = """
                SELECT *
                FROM requests
                WHERE id = ?;
                """;
        return jdbcTemplate.query(sql, rowMapper, id)
                .stream()
                .findFirst();
    }

    @Override
    public int AddRequest(Request request) {
        String sql = """
                INSERT INTO requests (post_id, donationType, quantity_needed)
                VALUES (?, ?, ?);
                """;
        return jdbcTemplate.update(
                sql,
                request.getPost_id(),
                request.getDonationType(),
                request.getQuantity_needed());
    }

    @Override
    public int deleteRequest(int id) {
        String sql = """
                DELETE FROM requests
                WHERE id = ?;
                """;
        return jdbcTemplate.update(sql, id);
    }

    @Override
    public int updateRequest(Integer id, Request request) {
        String sql = """
                UPDATE requests
                SET post_id = ?, donationType = ?, quantity_needed = ?
                WHERE id = ?;
                """;
        return jdbcTemplate.update(
                sql,
                request.getQuantity_needed(),
                request.getDonationType(),
                request.getQuantity_needed(),
                id);
    }
}
