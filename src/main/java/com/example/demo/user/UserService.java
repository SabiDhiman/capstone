package com.example.demo.user;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.lang.module.ResolutionException;
import java.util.List;
import java.util.Optional;

@Service
public class UserService {
    private UserDAO userDAO;

    @Autowired
    public UserService(@Qualifier("users") UserDAO userDAO){
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

    public void addUser(User user) {
        userDAO.addUser(user);
    }


    public void deleteUser(Integer id) {
        if(userDAO.selectUserById(id).isEmpty()){
            throw new ResolutionException("User with id " + id + " not found");
        }
        userDAO.deleteUser(id);
    }

    public void updateUser(Integer id, User updatedUser) {
        if(userDAO.selectUserById(id).isEmpty()){
            throw new ResolutionException("User with id " + id + " not found");
        }
        userDAO.updateUser(id, updatedUser);
    }
}
