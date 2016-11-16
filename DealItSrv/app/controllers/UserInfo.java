package controllers;

import java.util.Date;

/**
 * Created by Jose A Rodriguez Rivera on 10/11/16.
 */
public class UserInfo {
    private String email;
    private int userID;
    private int accountID;
    private String firstName;
    private String lastName;
    private String city;
    private String state;
    private String birthDate;



    public UserInfo(){}

    public UserInfo(String email, int accountID, String firstName, String lastName, String birthDate, String city, String state, int userID ){
        this.email = email;
        this.accountID = accountID;
        this.firstName = firstName;
        this.lastName = lastName;

        this.birthDate = birthDate;
        this.city = city;
        this.state = state;
        this.userID = userID;
    }

    public String getEmail() {
        return email;
    }

    public void updateEmail(String email) {
        this.email = email;
    }

    public int getAccountID() {
        return accountID;
    }

    public String getFirstName() {
        return firstName;
    }

    public void updateFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void updateLastName(String lastName) {
        this.lastName = lastName;
    }


    public String getBirthDate() {
        return birthDate;
    }

    public void updateBirthDate(String birthDate) {
        this.birthDate = birthDate;
    }

    public int getUserID(){
        return userID;
    }

    public String getCity(){
        return city;
    }

    public String getState(){
        return state;
    }

}
