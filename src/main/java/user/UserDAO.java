package user;

import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;
import java.util.Optional;


public interface UserDAO {

        List<User> selectAllUsers();

        Optional<User> selectUserById(Integer id);

        int AddUser(User user);

        int deleteUser(int id);

        int updateUser(Integer id, User user);
}
