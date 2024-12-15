package repository;

import model.User;

import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Repository;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
@Repository
public class UserRepository {

    private List<User> userList = new ArrayList<>();

    // Get all users
    public List<User> findAll() {
        return new ArrayList<>(userList);
    }

    // Get a user by ID
    public Optional<User> findById(String id) {
        return userList.stream()
                .filter(user -> user.getUserId().equals(id))
                .findFirst();
    }

    // Save or update a user
    public User save(User user) {
        userList.add(user);
        return user;
    }

    // Delete a user by ID
    public void deleteById(String id) {
        userList.removeIf(user -> user.getUserId().equals(id));
    }
}
