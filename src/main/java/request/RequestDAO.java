package request;

import user.User;

import java.util.List;
import java.util.Optional;

public interface RequestDAO {

    List<Request> selectAllRequests();

    Optional<Request> selectRequestById(Integer id);

    int AddRequest(Request request);

    int deleteRequest(int id);

    int updateRequest(Integer id, Request request);
}
