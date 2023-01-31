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


    public Customer(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
        signUpDate = LocalDateTime.now();
        super.setUserId();
    }

    public Customer(String firstName, String lastName, LocalDateTime signUpDate) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.signUpDate = signUpDate;
        super.setUserId();
    }

    // Overriding super get/set methods
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
