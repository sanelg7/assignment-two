package org.definex.practicum.product;

import org.definex.practicum.user.Vendor;

public class Product {

    private static int productIdCounter = 0;
    private int productId;
    private String name;
    private double price;

    private Vendor vendor;

    public Product(String name, double price, Vendor vendor) {
        this.name = name;
        this.price = price;
        this.vendor = vendor;

        productId = productIdCounter++;
    }

    // Setters and getters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getProductId() {
        return productId;
    }

    public Vendor getVendor() {
        return vendor;
    }

    @Override
    public String toString() {
        return "Product{" +
                "productId=" + productId +
                ", name='" + name + '\'' +
                ", price=" + price +
                '}';
    }
}
