package org.definex.practicum;

import org.definex.practicum.invoice.Invoice;
import org.definex.practicum.user.Customer;
import org.definex.practicum.user.User;

import java.util.ArrayList;
import java.util.List;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) {

        User user = new Customer();
        List<Invoice> invoices = new ArrayList<>();
        for (int i= 0;i<3;i++) {
            Invoice invoice = new Invoice();
            invoices.add(invoice);
        }
        for (Invoice i:invoices) {
            System.out.println(i);
        }


    }
}
