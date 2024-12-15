package repository;

import model.user;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Repository
public class UserRepository {

    private List<user> userList = new ArrayList<>();

    // Get all users
    public List<user> findAll() {
        return userList;
    }

    // Get a user by ID
    public Optional<user> findById(Long id) {
        return userList.stream()
                .filter(user -> user.getUserId().equals(id))
                .findFirst();
    }

    // Save or update a user
    public user save(user user) {
        userList.add(user);
        return user;
    }

    // Delete a user by ID
    public void deleteById(Long id) {
        userList.removeIf(user -> user.getUserId().equals(id));
    }
}