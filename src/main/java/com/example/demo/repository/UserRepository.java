// File: com/example/demo/repository/UserRepository.java
package com.example.demo.repository;

import com.example.demo.model.user;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Repository
public class UserRepository {

    private List<user> userList = new ArrayList<>();

    public user save(user user) {
        userList.add(user);
        return user;
    }

    public Optional<user> findByUsername(String username) {
        return userList.stream()
                .filter(user -> user.getUsername().equals(username))
                .findFirst();
    }

    public List<user> findAll() {
        return userList;
    }

    public List<user> findByRole(String role) {
        return userList.stream()
                .filter(user -> user.getRole().equals(role))
                .collect(Collectors.toList());
    }

    public void deleteByUsername(String username) {
        userList.removeIf(user -> user.getUsername().equals(username));
    }

    public boolean logoutUser(String username) {
        Optional<user> userOptional = findByUsername(username);
        if (userOptional.isPresent()) {
            user user = userOptional.get();
            user.setLoggedIn(false);
            return true;
        }
        return false;
    }
}