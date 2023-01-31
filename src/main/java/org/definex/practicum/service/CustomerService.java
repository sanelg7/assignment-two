package org.definex.practicum.service;

import org.definex.practicum.repository.CustomerRepository;
import org.definex.practicum.user.Customer;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class CustomerService {

    // Created a customer repository instance to get saved customers from.
    private CustomerRepository customerRepository = new CustomerRepository();

    // Adding a customer to customer repository
    public void addCustomer(Customer customer) {
        List<Customer> customers =
                customerRepository.getCustomers();
        customers.add(customer);
        customerRepository.setCustomers(customers);
    }

    // Get unique customer names from a list of customers
    public Set<String> getUniqueCustomerNames(Set<Customer> customers) {
        return customers.stream()
                .map(Customer::getFullName)
                .collect(Collectors.toSet());
    }

    // Returning all customers within the repository.
    public List<Customer> getCustomers() {
        return customerRepository.getCustomers();
    }

    // Filtering customers based on their full names containing some value.
    public List<Customer> filterByFullNameContains(String s) {
        return customerRepository.getCustomers()
                .stream().filter(
                        customer -> customer.getFullName().contains(s)).collect(Collectors.toList());
    }

    // Filtering customers based on the month they signed up.
    public List<Customer> filterBySignUpDate(LocalDateTime localDateTime) {
        return customerRepository.getCustomers()
                .stream().filter(
                        customer ->
                                customer.getSignUpDate().getMonth() == localDateTime.getMonth()).collect(Collectors.toList());


    }

}
