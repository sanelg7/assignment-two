package org.definex.practicum.service;

import org.definex.practicum.invoice.Invoice;
import org.definex.practicum.repository.InvoiceRepository;
import org.definex.practicum.user.Customer;
import org.definex.practicum.user.Vendor;

import java.util.*;
import java.util.stream.Collectors;

public class InvoiceService {

    private InvoiceRepository invoiceRepository = new InvoiceRepository();

    // Returning all Invoices from repository.
    public List<Invoice> getInvoices() {
        return invoiceRepository.getInvoices();
    }

    // Calculating average price from a list of invoices. Return zero.
    public double getAverage(List<Invoice> invoices) {
        return invoices.stream().mapToDouble(Invoice::getTotalPrice)
                .average()
                .orElse(0);
    }

    // Filtering all invoices based on price > than.
    public List<Invoice> totalGreaterThan(int totalPrice) {
        return getInvoices().stream().filter(
                invoice -> invoice.getTotalPrice() > totalPrice
        ).collect(Collectors.toList());
    }

    // Filtering all invoices based on price < than.
    public List<Invoice> totalLessThan(int totalPrice) {
        return getInvoices().stream().filter(
                invoice -> invoice.getTotalPrice() < totalPrice
        ).collect(Collectors.toList());
    }

    // Get List of unique users within an Invoice List.
    public Set<Customer> getUniqueCustomers(List<Invoice> invoices) {
        return invoices.stream()
                .map(Invoice::getCustomer)
                .collect(Collectors.toSet());
    }

    // Creating a hash map that has Vendor with all invoices for that vendor
    public HashMap<Vendor, List<Invoice>> getUniqueVendors() {
        return getInvoices().stream()
                .collect(Collectors.groupingBy(Invoice::getVendor, HashMap::new,
                        Collectors.toCollection(ArrayList::new)));
    }

    // Getting the average of all invoices for one vendor.
    public HashMap<Vendor, Double> getAverageTotalPriceByVendor() {

        HashMap<Vendor, Double> result = new HashMap<>();
        getUniqueVendors().forEach(
                (k, v) -> result.put(k, v.stream()
                        .mapToDouble(Invoice::getTotalPrice).sum()));

        return result;
    }

    // Finally, a method to check if total price average for a vendor is less than some value. Returns both vendor name and sector to be clear.
    public Map<String, String> averageLessThan(double limit) {
        return getAverageTotalPriceByVendor().entrySet().stream()
                .filter(
                        pair -> pair.getValue() < limit
                ).collect(Collectors.toMap(e -> e.getKey().getSector(), e -> e.getKey().getVendorName()));
    }


}
