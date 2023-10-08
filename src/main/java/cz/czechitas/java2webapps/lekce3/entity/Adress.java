package cz.czechitas.java2webapps.lekce3.entity;

public class Adress {
    private String street;
    private String number;
    private String town;
    private String postCode;

    public Adress(String street, String number, String town, String postCode) {
        this.street = street;
        this.number = number;
        this.town = town;
        this.postCode = postCode;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getTown() {
        return town;
    }

    public void setTown(String town) {
        this.town = town;
    }

    public String getPostCode() {
        return postCode;
    }

    public void setPostCode(String postCode) {
        this.postCode = postCode;
    }
}

