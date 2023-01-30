package org.definex.practicum.user;

public class User {

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

    // Setter and getter methods for Customer subclass to override.
    public void setFirstName(String firstName){}
    public String getFirstName(){
        return null;
    }
    public void setLastName(String lastName){}

    public String getLastName(){
        return null;
    }

    // Setter and getter methods for Vendor subclass to override.
    public String getVendorName() {
        return null;
    }

    public void setVendorName(String vendorName) {}

    public String getSector() {
        return null;
    }
    public void setSector(String sector) {}

    // toString(). Should be overridden by both subclasses

}
