package org.definex.practicum.user;


import java.time.LocalDateTime;

public class Customer extends User {


    LocalDateTime signUpDate;
    private String firstName;
    private String lastName;

    public Customer() {
        super();
    }

    public Customer(LocalDateTime signupDate) {
        super();
    }


    // Sets supers userID to keep track of unique users

    public Customer(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
        signUpDate = LocalDateTime.now();
        super.setUserId();
    }

    /*
    Normally this constructor would not be needed.
    But to demonstrate a required functionality (*signed up in June),
    I had to create dummy data. This is for that specifically.
    Also sets supers userID to keep track of unique users
    */
    public Customer(String firstName, String lastName, LocalDateTime signUpDate) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.signUpDate = signUpDate;
        super.setUserId();
    }

    // Setters and getters

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

    public LocalDateTime getSignUpDate() {
        return signUpDate;
    }

    public void setSignUpDate(LocalDateTime signUpDate) {
        this.signUpDate = signUpDate;
    }

    public String getFullName() {
        return firstName + " " + lastName;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "customerId='" + super.getUserId() + '\'' +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                '}';
    }
}
