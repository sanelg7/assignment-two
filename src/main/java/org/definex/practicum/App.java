package org.definex.practicum;

import org.definex.practicum.invoice.Invoice;
import org.definex.practicum.product.Product;
import org.definex.practicum.user.Customer;
import org.definex.practicum.user.User;
import org.definex.practicum.user.Vendor;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) {


        // Test product
        Product product = new Product("Apple", 2);
        Product product2 = new Product("Orange", 3.2);
        Product product3 = new Product("Banana", 2.3);
        Set<Product> products = new HashSet<>();
        products.add(product2);
        products.add(product3);
        products.add(product);


        User customerUser = new Customer(
                "sanelege@gmail.com",
                "test123",
                "Ege", "Sanel"
        );

        User vendorUser = new Vendor(
                "somevendor@vendorname.com",
                "test123",
                "definex",
                "Software",
                products);

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
        System.out.println("Vendor name: " + ((Vendor) vendorUser).getVendorName());
        System.out.println();


        // Access products of vendor
        System.out.println("Vendor products: " + ((Vendor) vendorUser).getProducts());

        // Testing overridden toString() methods
        /*System.out.println(customerUser.toString());
        System.out.println(vendorUser.toString());*/






    }
}
