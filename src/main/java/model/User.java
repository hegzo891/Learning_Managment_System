package model;

public class User {
    private static Long idCounter = 1L; // For generating unique IDs

    private Long userId;
    private String username;
    private String password;
    private String role;

    public User() {
        this.userId = idCounter++;
    }

    public User(String username, String password, String role) {
        this.userId = idCounter++;
        this.username = username;
        this.password = password;
        this.role = role;
    }

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }
}