package org.definex.practicum.repository;

import org.definex.practicum.user.Customer;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class CustomerRepository {

    private List<Customer> customers;

    // Creating data manually for demonstration purposes.
    public CustomerRepository() {
        customers = new ArrayList<>();
        LocalDateTime now = LocalDateTime.now();
        customers.add(new Customer("Ahmet", "Kötü", now.minusMonths(5)));
        customers.add(new Customer("Veli", "İyi", now.minusMonths(8)));
        customers.add(new Customer("Can", "Güzel", now.minusMonths(7)));
        customers.add(new Customer("Ayse", "Cirkin", now.minusMonths(7)));
        customers.add(new Customer("Fatma", "Zeki", now.minusMonths(3)));
    }


    public List<Customer> getCustomers() {
        return customers;
    }

    public void setCustomers(List<Customer> customers) {
        this.customers = customers;
    }
}
