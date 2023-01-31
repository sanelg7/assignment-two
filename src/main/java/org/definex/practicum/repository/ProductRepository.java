package org.definex.practicum.repository;

import org.definex.practicum.product.Product;

import java.util.ArrayList;
import java.util.List;

public class ProductRepository {

    // Creating a set of products.
    private List<Product> productList;

    // Using the VendorRepository to fetch vendors and put them into products.
    private VendorRepository vendorRepository = new VendorRepository();

    // Creating a list of hardcoded products for demonstration
    public ProductRepository() {
        productList = new ArrayList<>();
        productList.add(new Product("Apple", 2.5, vendorRepository.getVendors().get(0)));
        productList.add(new Product("Orange", 3, vendorRepository.getVendors().get(0)));
        productList.add(new Product("Banana", 4.2, vendorRepository.getVendors().get(1)));
        productList.add(new Product("Tomato", 1.4, vendorRepository.getVendors().get(1)));
        productList.add(new Product("Keyboard", 150, vendorRepository.getVendors().get(2)));
        productList.add(new Product("Keyboard", 300, vendorRepository.getVendors().get(3)));
        productList.add(new Product("Dumbbell", 100, vendorRepository.getVendors().get(4)));
        productList.add(new Product("Vitamin C Capsules", 100, vendorRepository.getVendors().get(4)));
        productList.add(new Product("Vitamin C Capsules", 120, vendorRepository.getVendors().get(5)));
        productList.add(new Product("Vitamin D Capsules", 200, vendorRepository.getVendors().get(5)));
    }

    public List<Product> getProductList() {
        return productList;
    }

}
