package hub;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
import request.Request;
import request.RequestDAO;

import java.util.List;
import java.util.Optional;

@Service
public class HubService {

        private HubDAO hubDAO;

        public HubService(@Qualifier("postgresHubs")HubDAO hubDAO){
            this.hubDAO = hubDAO;
        }

        public List<Hub> getAllHubs() {
            return hubDAO.selectAllHubs();
        }

        public Optional<Hub> getHubById(int id) throws Exception {
            if (hubDAO.selectHubById(id).isEmpty()){
                throw new Exception("Hub with the id " + id + " not found");
            }
            return hubDAO.selectHubById(id);
        }

        public void createHub(Hub hub) {
            hubDAO.AddHub(hub);
        }
}
