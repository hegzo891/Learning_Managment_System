package controller;

import model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import services.UserService;

import java.util.List;
import java.util.Optional;

@RestController // Ensures JSON responses
@RequestMapping("/users") // Base path for all endpoints
public class UserController {

    @Autowired
    private UserService userService;

    // Endpoint: GET /users
    @GetMapping
    public List<User> getAllUsers() {
        return userService.getAllUsers();
    }

    // Endpoint: GET /users/{id}
    @GetMapping("/{id}")
    public Optional<User> getUserById(@PathVariable String id) {
        return userService.getUserById(id);
    }

    // Endpoint: POST /users/adduser
    @PostMapping("/adduser")
    public User createUser(@RequestBody User user) {
        return userService.createUser(user);
    }

    // Endpoint: DELETE /users/{id}
    @DeleteMapping("/{id}")
    public void deleteUser(@PathVariable String id) {
        userService.deleteUser(id);
    }
}
