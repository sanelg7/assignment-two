package org.definex.practicum.user;

import org.definex.practicum.product.Product;

import java.util.Set;

public class Vendor extends User{

    private String vendorName;
    private String sector;

    private Set<Product> products;
    public Vendor(String login, String password) {
        super(login, password);
    }

    public Vendor(String login, String password, String vendorName, String sector, Set<Product> products) {
        super(login, password);
        this.vendorName = vendorName;
        this.sector = sector;
        this.products = products;
    }

    public String getVendorName() {
        return vendorName;
    }

    public void setVendorName(String vendorName) {
        this.vendorName = vendorName;
    }

    public String getSector() {
        return sector;
    }

    public void setSector(String sector) {
        this.sector = sector;
    }

    public Set<Product> getProducts() {
        return products;
    }

    public void setProducts(Set<Product> products) {
        this.products = products;
    }

    @Override
    public String toString() {
        return "Vendor{" +
                "vendorId='" + super.getUserId() + '\'' +
                ", login='" + super.getLogin() + '\'' +
                ", vendorName='" + vendorName + '\'' +
                ", sector='" + sector + '\'' +
                '}';
    }
}
