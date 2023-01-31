package org.definex.practicum.user;

public class Vendor extends User {

    private String vendorName;
    private String sector;


    public Vendor(String vendorName, String sector) {
        this.vendorName = vendorName;
        this.sector = sector;
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
