package controllers;

import java.util.Date;

/**
 * Created by Jose A Rodriguez Rivera on 10/11/16.
 */
public class CreditCard {
    private String name;
    private String cardNumber;
    private Date expDate;
    private int securityCode;
    private String billingAddress;

    public CreditCard(){}

    public CreditCard(String name, String cardNumber, Date expDate, int securityCode, String billingAddress) {
        this.name = name;
        this.cardNumber = cardNumber;
        this.expDate = expDate;
        this.securityCode = securityCode;
        this.billingAddress = billingAddress;
    }

    public String getName() {
        return name;
    }

    public String getCardNumber() {
        return cardNumber;
    }

    public Date getExpDate() {
        return expDate;
    }

    public int getSecurityCode() {
        return securityCode;
    }

    public String getBillingAddress() {
        return billingAddress;
    }
}
