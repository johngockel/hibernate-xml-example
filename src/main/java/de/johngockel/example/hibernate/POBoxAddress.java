package de.johngockel.example.hibernate;

public class POBoxAddress extends Address {

    private String poBoxNumber;

    public String getPoBoxNumber() {
        return poBoxNumber;
    }

    public void setPoBoxNumber(String poBoxNumber) {
        this.poBoxNumber = poBoxNumber;
    }

    @Override
    public String getAddressStamp() {
        StringBuilder sb = new StringBuilder();
        sb.append(poBoxNumber);
        sb.append("\n");
        sb.append(super.toString());
        return sb.toString();
    }

    public String toString() {
        return getAddressStamp();
    }
}
