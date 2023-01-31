package org.definex.practicum.repository;

import org.definex.practicum.invoice.Invoice;
import org.definex.practicum.product.Product;
import org.definex.practicum.user.Customer;
import org.definex.practicum.user.Vendor;

import java.time.LocalDateTime;
import java.util.*;

public class InvoiceRepository {


    private List<Invoice> invoices;

    // Creating data manually for demonstration purposes.
    public InvoiceRepository() {
        invoices = new ArrayList<>();
        LocalDateTime localDateTime = LocalDateTime.now();

        // Using the other repositories to populate Invoice objects.
        CustomerRepository customerRepository = new CustomerRepository();
        VendorRepository vendorRepository = new VendorRepository();
        List<Customer> customers = customerRepository.getCustomers();
        List<Vendor> vendors = vendorRepository.getVendors();
        Random random = new Random();

        invoices.add(new Invoice(
                localDateTime, createInvoiceDetail(),
                customers.get(random.nextInt(customers.size())), vendors.get(random.nextInt(customers.size()))));
        invoices.add(new Invoice(
                localDateTime, createInvoiceDetail(),
                customers.get(random.nextInt(customers.size())), vendors.get(random.nextInt(customers.size()))));
        invoices.add(new Invoice(
                localDateTime, createInvoiceDetail(),
                customers.get(random.nextInt(customers.size())), vendors.get(random.nextInt(customers.size()))));
        invoices.add(new Invoice(
                localDateTime, createInvoiceDetail(),
                customers.get(random.nextInt(customers.size())), vendors.get(random.nextInt(customers.size()))));
        invoices.add(new Invoice(
                localDateTime, createInvoiceDetail(),
                customers.get(random.nextInt(customers.size())), vendors.get(random.nextInt(customers.size()))));
    }

    public List<Invoice> getInvoices() {
        return invoices;
    }

    /* Helper method to create random basket for each invoice. It returns a Map of Products and their count
    ex:
    3 Bananas and 4 Apples make a basket
    */
    private HashMap<Product, Integer> createInvoiceDetail() {
        ProductRepository productRepository = new ProductRepository();
        Random random = new Random();

        int productTypeCount = random.nextInt(5 - 1) + 1;
        int productCount = random.nextInt(3 - 1) + 1;

        // Product map to hold <ProductType, Amount>.
        Map<Product, Integer> productAmountMap = new HashMap<>();

        // Populating the map.
        for (Product p : productRepository.getProductList()) {
            // Random product type count. Minimum 1 and maximum 5. ex. Apple , Banana
            productTypeCount = random.nextInt(5 - 1) + 1;
            // Random product count. Minimum 1 , maximum 3.
            productCount = random.nextInt(3 - 1) + 1;
            // Get random product by using product repository.
            List<Product> products = productRepository.getProductList();
            for (int i = 0; i < productTypeCount; i++) {
                Product randomProduct =
                        products.get(random.nextInt(products.size()));
                productAmountMap.put(randomProduct, productCount);
            }

        }
        return (HashMap<Product, Integer>) productAmountMap;
    }

}
