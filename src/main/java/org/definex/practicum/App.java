package org.definex.practicum;

import org.definex.practicum.invoice.Invoice;
import org.definex.practicum.user.Customer;
import org.definex.practicum.user.User;
import org.definex.practicum.user.Vendor;

import java.util.ArrayList;
import java.util.List;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) {


        User customerUser = new Customer(
                "sanelege@gmail.com",
                "test123",
                "Ege", "Sanel"
        );

        User vendorUser = new Vendor(
                "somevendor@vendorname.com",
                "test123",
                "definex",
                "Software");

        List<Invoice> invoices = new ArrayList<>();
        for (int i= 0;i<3;i++) {
            Invoice invoice = new Invoice();
            invoices.add(invoice);
        }
        for (Invoice i:invoices) {
            System.out.println(i);
        }

        System.out.println("Customer login: " + customerUser.getLogin());
        System.out.println("Customer pass: " + customerUser.getPassword());
        System.out.println();
        System.out.println("Vendor login: " + vendorUser.getLogin());
        System.out.println("Vendor pass: " + vendorUser.getPassword());
        System.out.println("Vendor name: " + vendorUser.getVendorName());
        System.out.println("Vendor sector: " + vendorUser.getSector());


        // Testing overridden toString() methods
        System.out.println(customerUser.toString());
        System.out.println(vendorUser.toString());






    }
}
