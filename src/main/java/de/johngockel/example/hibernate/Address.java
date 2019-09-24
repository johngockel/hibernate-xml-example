package de.johngockel.example.hibernate;

public abstract class Address {

    private long id;

    protected String town;
    protected String postcode;
    protected String country;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getTown() {
        return town;
    }

    public void setTown(String town) {
        this.town = town;
    }

    public String getPostcode() {
        return postcode;
    }

    public void setPostcode(String postcode) {
        this.postcode = postcode;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public abstract String getAddressStamp();

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(postcode + " " + town);
        sb.append("\n");
        sb.append(country);
        return sb.toString();
    }
}
