package org.definex.practicum.invoice;

import org.definex.practicum.product.Product;

import java.time.LocalDateTime;
import java.util.HashMap;

public class Invoice {

    //  Provided static value to mimic an auto increment operation on invoiceId.
    private static int invoiceIdCounter = 0;
    private int invoiceId;
    private LocalDateTime date;
    private HashMap<Product, Integer> products;
    private int totalPrice;

    public Invoice() {
        invoiceId = invoiceIdCounter++;
    }

    public Invoice(LocalDateTime date, HashMap<Product, Integer> products) {
        this.date = date;
        this.products = products;

        invoiceId = invoiceIdCounter++;

    }

    public int getInvoiceId() {
        return invoiceId;
    }

    public int getTotalPrice() {
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

    @Override
    public String toString() {
        return "Invoice{" +
                "invoiceId=" + invoiceId +
                ", date=" + date +
                ", products=" + products +
                ", totalPrice=" + totalPrice +
                '}';
    }
}
