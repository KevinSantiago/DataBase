package controllers;

/**
 * Created by Jose A Rodriguez Rivera on 10/2/16.
 */
public class User {
    private String name;
    private String phoneNumber;
    private String city;
    private String email;

    public User(String name, String phoneNumber, String city, String email){
        this.name = name;
        this.phoneNumber = phoneNumber;
        this.city = city;
        this.email = email;
    }

    public String getName(){
        return this.name;
    }

    public String getPhoneNumber(){
        return this.phoneNumber;
    }

    public String getCity(){
        return this.city;
    }

    public String getEmail(){
        return this.email;
    }
}
