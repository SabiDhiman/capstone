package donation;

import org.flywaydb.core.internal.jdbc.RowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;
import request.Request;
import request.RequestRowMapper;
import user.User;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;
import java.util.Optional;

@Repository
public class DonationDatabaseAccessService implements DonationDAO {
    private org.springframework.jdbc.core.JdbcTemplate jdbcTemplate;

    public DonationDatabaseAccessService(JdbcTemplate jdbcTemplate) {this.jdbcTemplate = jdbcTemplate;}

    @Override
    public List<Donation> selectAllDonations() {
        String sql = """
                SELECT *
                FROM donations;
                """;

        return jdbcTemplate.query(sql, new DonationRowMapper());
    }

    @Override
    public Optional<Donation> selectDonationByUser(User user) {
        String sql = """
                SELECT *
                FROM donations
                WHERE user_id = ?;
                """;
        return jdbcTemplate.query(sql, new DonationRowMapper(), user.getId())
                .stream()
                .findFirst();
    }

    @Override
    public int AddDonation(Donation donation) {
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
                UPDATE requests
                SET user_id = ?, donation_quantity = ?, request_id = ?
                WHERE id = ?;
                """;
        return jdbcTemplate.update(
                sql,
                donation.getUser_id(),
                donation.getDonation_quantity(),
                donation.getRequest_id());
    }
}
