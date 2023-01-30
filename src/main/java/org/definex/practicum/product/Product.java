package org.definex.practicum.product;

public class Product {

    private static int productIdCounter = 0;

    private int productId;
    private String name;
    private double price;

    public Product(String name, double price) {
        this.name = name;
        this.price = price;

        productId = productIdCounter++;
    }

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

    @Override
    public String toString() {
        return "Product{" +
                "productId=" + productId +
                ", name='" + name + '\'' +
                ", price=" + price +
                '}';
    }
}
