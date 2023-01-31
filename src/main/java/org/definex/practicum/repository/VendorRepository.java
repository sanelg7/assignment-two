package org.definex.practicum.repository;

import org.definex.practicum.user.Vendor;

import java.util.ArrayList;
import java.util.List;

public class VendorRepository {

    // Creating a set of vendors.
    private List<Vendor> vendors;

    // Creating data manually for demonstration purposes.
    public VendorRepository() {
        vendors = new ArrayList<>();
        vendors.add(new Vendor("Whole Goods", "Food"));
        vendors.add(new Vendor("Super Market", "Food"));
        vendors.add(new Vendor("Electronics Shop", "Home Electronics"));
        vendors.add(new Vendor("Game Shop", "Gaming"));
        vendors.add(new Vendor("Gym Shop", "Fitness"));
        vendors.add(new Vendor("Vitamin Shop", "Supplements"));
    }

    public List<Vendor> getVendors() {
        return vendors;
    }
}
