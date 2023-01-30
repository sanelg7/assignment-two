package org.definex.practicum.user;


public class Customer extends User {


    private String firstName;
    private String lastName;

    //


    public Customer(String login, String password) {
        super(login, password);
    }

    public Customer(String login, String password, String firstName, String lastName) {
        super(login, password);
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }


}
