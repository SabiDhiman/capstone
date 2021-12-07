package user;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserService {
    private UserDAO userDAO;

    @Autowired
    public UserService(UserDAO userDAO) {
        this.userDAO = userDAO;
    }

    public List<User> getAllUsers() {
        return userDAO.selectAllUsers();
    }

    public Optional<User> getUserById(int id) throws Exception {
        if (userDAO.selectUserById(id).isEmpty()){
            throw new Exception("User with the id " + id + " not found");
        }
        return userDAO.selectUserById(id);
    }

    public void createUser(User user) {
        userDAO.AddUser(user);
    }
}
