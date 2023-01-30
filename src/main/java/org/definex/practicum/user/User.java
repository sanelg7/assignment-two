package org.definex.practicum.user;

public abstract class User {

    private static int userIdCounter = 0;

    private int userId;
    private String login;
    private String password;

    public User(String login, String password) {
        this.login = login;
        this.password = password;

        userId = userIdCounter++;
    }

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


}
