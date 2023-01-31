package org.definex.practicum.user;

public class Vendor extends User {

    private String vendorName;
    private String sector;


    // Sets supers userID to keep track of unique users
    public Vendor(String vendorName, String sector) {
        this.vendorName = vendorName;
        this.sector = sector;
        super.setUserId();
    }

    // Setters and getters
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
