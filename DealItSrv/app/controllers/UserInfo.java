package controllers;

import java.util.Date;

/**
 * Created by Jose A Rodriguez Rivera on 10/11/16.
 */
public class UserInfo {
    private String email;
    private int accountID;
    private String firstName;
    private String lastName;
    private String phoneNumber;
    private Date birthDate;
    private Address address;
    private Account userAccount;

    public UserInfo(){}

    public UserInfo(String email, int accountID, String firstName, String lastName, String phoneNumber, Date birthDate, Address address, Account userAccount){
        this.email = email;
        this.accountID = accountID;
        this.firstName = firstName;
        this.lastName = lastName;
        this.phoneNumber = phoneNumber;
        this.birthDate = birthDate;
        this.address = address;
        this.userAccount = userAccount;
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

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void updatePhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public Date getBirthDate() {
        return birthDate;
    }

    public void updateBirthDate(Date birthDate) {
        this.birthDate = birthDate;
    }

    public Address getAddress() {
        return address;
    }

    public void updateAddress(Address address) {
        this.address = address;
    }

    public Account getUserAccount() {
        return userAccount;
    }

    public void setUserAccount(Account userAccount) {
        this.userAccount = userAccount;
    }
}
