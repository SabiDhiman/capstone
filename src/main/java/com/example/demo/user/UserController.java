package com.example.demo.user;

import com.example.demo.hub.Hub;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/user")
public class UserController {
    private UserService userService;

    @Autowired
    public UserController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping
    public List<User> getAllUsers() {
        return userService.getAllUsers();
    }

    @GetMapping("{id}")
    public Optional<User> getUserById(@PathVariable("id") int id) throws Exception {
        return userService.getUserById(id);
    }

    @PostMapping
    public void addUser(@RequestBody User user) {
        userService.addUser(user);
    }

    @DeleteMapping("{id}")
    public void deleteUser(@PathVariable("id") @RequestBody Integer id) {
        userService.deleteUser(id);
    }

    @PutMapping("{id}")
    public void updateUser(@PathVariable("id") Integer id, @RequestBody User user) {
        userService.updateUser(id, user);
    }
}
