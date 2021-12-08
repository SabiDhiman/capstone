package request;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Component;

import java.sql.ResultSet;
import java.sql.SQLException;

@Component
public class RequestRowMapper implements RowMapper<Request> {
    @Override
    public Request mapRow(ResultSet rs, int rowNum ) throws SQLException {
        Request request = new Request(
                rs.getInt("id"),
                rs.getInt("post_id"),
                rs.getString("donationType"),
                rs.getInt("quantity_needed")
        );

        return request;
    }
}
