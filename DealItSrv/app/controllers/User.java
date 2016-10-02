package controllers;

/**
 * Represents the Users on the server.
 * Created by Jose A Rodriguez Rivera on 10/2/16.
 */
public class User {
    private int id;
    private String name;
    private String phoneNumber;
    private String city;
    private String email;

    /**
     * Constructor. Creates an instance of User.
     * @param id the User id
     * @param name the name of the User
     * @param phoneNumber the phone number of the User
     * @param city the city of the User
     * @param email the email of the user
     */
    public User(int id, String name, String phoneNumber, String city, String email){
        this.name = name;
        this.phoneNumber = phoneNumber;
        this.city = city;
        this.email = email;
    }

    /**
     * Returns the name of the User.
     * @return the name of the User.
     */
    public String getName(){
        return this.name;
    }

    /**
     * Returns the User's phone number.
     * @return the User's phone number
     */
    public String getPhoneNumber(){
        return this.phoneNumber;
    }

    /**
     * Returns the User's city.
     * @return the User's city
     */
    public String getCity(){
        return this.city;
    }

    /**
     * Return the User's email.
     * @return the User's email
     */
    public String getEmail(){
        return this.email;
    }

    /**
     * Return the User's id
     * @return the User's id
     */
    public int getID(){
        return this.id;
    }

    /**
     * Updates the User's name.
     * @param name the User's new name
     */
    public void updateName(String name){
        this.name = name;
    }

    /**
     * Updates the User's phone number.
     * @param phoneNumber the User's new phone number
     */
    public void updatePhoneNumber(String phoneNumber){
        this.phoneNumber = phoneNumber;
    }

    /**
     * Updates the User's city.
     * @param city the User's new city
     */
    public void updateCity(String city){
        this.city = city;
    }

    /**
     * Updates the User's email.
     * @param email the User's new email
     */
    public void updateEmail(String email){
        this.email = email;
    }
}
