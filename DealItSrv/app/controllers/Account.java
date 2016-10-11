package controllers;

import java.util.Date;

/**
 * Created by Jose A Rodriguez Rivera on 10/11/16.
 */
public class Account {
    private int accountID;
    private String type;
    private String email;
    private Date registerDate;
    private CreditCard card;

    public Account(){}

    public Account(int accountID, String type, String email, Date registerDate, CreditCard card) {
        this.accountID = accountID;
        this.type = type;
        this.email = email;
        this.registerDate = registerDate;
        this.card = card;
    }

    public int getAccountID() {
        return accountID;
    }

    public String getType() {
        return type;
    }

    public String getEmail() {
        return email;
    }

    public Date getRegisterDate() {
        return registerDate;
    }

    public CreditCard getCard() {
        return card;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void updateEmail(String email) {
        this.email = email;
    }

    public void updateCard(CreditCard card) {
        this.card = card;
    }
}
