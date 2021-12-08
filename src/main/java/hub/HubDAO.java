package hub;

import request.Request;

import java.util.List;
import java.util.Optional;

public interface HubDAO {

    List<Hub> selectAllHubs();

    Optional<Hub> selectHubById(Integer id);

    int AddHub(Hub hub);

    int deleteHub(int id);

    int updateHub(Integer id, Hub hub);
}
