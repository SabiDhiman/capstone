package com.example.demo.user;

import java.util.List;
import java.util.Optional;


public interface UserDAO {

        List<User> selectAllUsers();

        Optional<User> selectUserById(Integer id);

        int addUser(User user);

        int deleteUser(int id);

        int updateUser(Integer id, User user);
}
