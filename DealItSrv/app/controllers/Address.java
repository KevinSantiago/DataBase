package controllers;

/**
 * Created by Jose A Rodriguez Rivera on 10/11/16.
 */
public class Address {
    private int uid;
    private String street;
    private String city;
    private String country;
    private String zipCode;
    
    public Address(){}

    public Address(int uid, String street, String city, String country, String zipCode) {
        this.uid = uid;
        this.street = street;
        this.city = city;
        this.country = country;
        this.zipCode = zipCode;
    }

    public int getUid() {
        return uid;
    }

    public String getStreet() {
        return street;
    }

    public void updateStreet(String street) {
        this.street = street;
    }

    public String getCity() {
        return city;
    }

    public void updateCity(String city) {
        this.city = city;
    }

    public String getZipCode() {
        return zipCode;
    }

    public void updateZipCode(String zipCode) {
        this.zipCode = zipCode;
    }

    public String getCountry() {
        return country;
    }

    public void updateCountry(String country) {
        this.country = country;
    }
}
