package org.definex.practicum.invoice;

import org.definex.practicum.product.Product;
import org.definex.practicum.user.Customer;
import org.definex.practicum.user.Vendor;

import java.time.LocalDateTime;
import java.util.HashMap;

public class Invoice {

    //  Provided static value to mimic an auto increment operation on invoiceId.
    private static int invoiceIdCounter = 0;
    private int invoiceId;
    private LocalDateTime date;
    private HashMap<Product, Integer> products;
    private double totalPrice;

    private Customer customer;

    private Vendor vendor;

    public Invoice() {
        invoiceId = invoiceIdCounter++;
    }

    public Invoice(LocalDateTime date, HashMap<Product, Integer> products, Customer customer, Vendor vendor) {
        this.date = date;
        this.products = products;
        this.customer = customer;
        this.vendor = vendor;
        invoiceId = invoiceIdCounter++;
        calculateTotalPrice();

    }

    public int getInvoiceId() {
        return invoiceId;
    }

    public double getTotalPrice() {
        return totalPrice;
    }

    public LocalDateTime getDate() {
        return date;
    }

    public void setDate(LocalDateTime date) {
        this.date = date;
    }

    public HashMap<Product, Integer> getProducts() {
        return products;
    }

    public void setProducts(HashMap<Product, Integer> products) {
        this.products = products;
    }

    public Customer getCustomer() {
        return customer;
    }

    public Vendor getVendor() {
        return vendor;
    }

    // Calculates total price as (Product Price * Lot Count)
    final void calculateTotalPrice() {
        totalPrice = 0;
        for (Product p : products.keySet()) {
            totalPrice += p.getPrice() * products.get(p);
        }
    }


    @Override
    public String toString() {
        return "Invoice{" +
                "invoiceId=" + invoiceId +
                ", date=" + date +
                ", products=" + products +
                ", totalPrice=" + totalPrice +
                ", customerId=" + customer.getUserId() +
                ", vendorId=" + vendor.getUserId() +
                '}';
    }
}
