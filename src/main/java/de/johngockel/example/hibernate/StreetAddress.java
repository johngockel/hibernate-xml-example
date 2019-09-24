package de.johngockel.example.hibernate;

public class StreetAddress extends Address {

    private String street;
    private String houseNumber;

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getHouseNumber() {
        return houseNumber;
    }

    public void setHouseNumber(String houseNumber) {
        this.houseNumber = houseNumber;
    }

    @Override
    public String getAddressStamp() {
        StringBuilder sb = new StringBuilder();
        sb.append(street + " " + houseNumber);
        sb.append("\n");
        sb.append(super.toString());
        return sb.toString();
    }

    public String toString() {
        return getAddressStamp();
    }
}
