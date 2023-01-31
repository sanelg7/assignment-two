package org.definex.practicum.user;

public abstract class User {

    // To mimic AUTO_INCREMENT
    private static int userIdCounter = 0;

    private int userId;
    private String login;
    private String password;

    public User() {
    }

    public User(String login, String password) {
        this.login = login;
        this.password = password;

        userId = userIdCounter++;
    }

    // Setters and getters. Does not include setUserId as it would breake logic.

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public int getUserId() {
        return userId;
    }

    // Will hold uniqueness as there are no parameters.
    public void setUserId() {
        userId = userIdCounter++;
    }


}
