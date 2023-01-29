package org.definex.practicum.user;


import org.definex.practicum.invoice.Invoice;

import java.util.List;

public class Customer extends User {

    private String firstName;
    private String lastName;

    private List<Invoice> invoices;



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

    public List<Invoice> getInvoices() {
        return invoices;
    }

    public void setInvoices(List<Invoice> invoices) {
        this.invoices = invoices;
    }
}
