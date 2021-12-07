package donation;

import org.flywaydb.core.internal.jdbc.JdbcTemplate;
import org.flywaydb.core.internal.jdbc.RowMapper;
import org.springframework.stereotype.Repository;
import user.User;

import java.sql.ResultSet;
import java.sql.SQLException;

@Repository
public class DonationDatabaseAccessService {
    private JdbcTemplate jdbcTemplate;

    public DonationDatabaseAccessService(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    RowMapper rowMapper = new RowMapper() {
        @Override
        public Object mapRow(ResultSet rs, int rowNum) throws SQLException {
            Donation donation = new Donation(
                    rs.getInt("id"),
                    rs.getInt("user_id"),
                    rs.getInt("donation_quantity"),
                    rs.getInt("donation_quantity"),
                    rs.getString("request_id"));
            return donation;
        }
    };
}
