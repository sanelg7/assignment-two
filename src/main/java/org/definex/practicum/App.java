package org.definex.practicum;

import org.definex.practicum.service.CustomerService;
import org.definex.practicum.service.InvoiceService;
import org.definex.practicum.user.Customer;

import java.time.LocalDateTime;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) {

        // Creating services to run tasks.
        CustomerService customerService = new CustomerService();
        InvoiceService invoiceService = new InvoiceService();

        // Listing all customers
        System.out.println("\nAll customers: ");
        System.out.println(customerService.getCustomers());

        // Create a new Customer
        System.out.println("\nCreating a customer..");
        customerService.addCustomer(new Customer("Ege", "Sanel"));
        // Print created user
        System.out.println("User created: ");
        System.out.println(customerService.getCustomers().get(
                customerService.getCustomers().size() - 1
        ));

        // Listing Customers that have the letter 'C' in their full names. Case-sensitive.
        System.out.println("\nCustomers with the letter 'C' in their name: ");
        System.out.println(
                customerService.filterByFullNameContains("C")
        );

        // Total invoice amount for customers that signed up in June.
        System.out.println("\nTotal invoice amount for customers that signed up in June");
        customerService.filterBySignUpDate(LocalDateTime.now().minusMonths(7));
        // List of all invoices.
        System.out.println("\nListing all invoices: ");
        System.out.println(invoiceService.getInvoices());

        // List of all invoices with total amount > 1500
        System.out.println("\nListing all invoices with total amount > 1500");
        System.out.println(invoiceService.totalGreaterThan(1500));

        // Average of all invoices with total amount > 1500
        System.out.println("\nAverage invoice total of all invoices with total amount > 1500");
        System.out.println("Average: " +
                invoiceService.getAverage(
                        invoiceService.totalGreaterThan(1500)));

        // List of all with total invoice amount < 500. Only print names.
        System.out.println("\nList of all customers with total invoice amount < 500");
        System.out.println(
                customerService.getUniqueCustomerNames(
                        invoiceService.getUniqueCustomers(
                                invoiceService.totalLessThan(1400))
                ));
        // List sector names of all vendors that have an average invoice cost < 750 for June.
        System.out.println("\nListing the sector names of all vendors that have an average invoice cost < 750 for June");
        System.out.println(invoiceService.averageLessThan(1500));


    }
}
