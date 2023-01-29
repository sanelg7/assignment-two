package org.definex.practicum.invoice;

import org.definex.practicum.product.Product;

import java.time.LocalDateTime;
import java.util.HashMap;

public class Invoice {

    private static int invoiceId;
    private LocalDateTime date;
    private HashMap<Product, Integer> products;
    private int totalPrice;

}
