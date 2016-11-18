package controllers;

import java.util.Date;

/**
 * Created by Jose A Rodriguez Rivera on 10/11/16.
 */
public class CreditCard {
    public int crID;
    public String cardNumber;
    public String expDate;
    public String securityCode;
    public String type;
    public String bzip;
    public String bcity;
    public String country;
    public String bstate;
    public String baddress;

    public CreditCard(){}

    public CreditCard(int crID,String cardNumber, String expDate, String securityCode, String type,String bzip,String bcity,String country, String bstate, String baddress) {
        this.cardNumber = cardNumber;
        this.expDate = expDate;
        this.securityCode = securityCode;
        this.type= type;
        this.crID = crID;
        this.bzip=bzip;
        this.bcity=bcity;
        this.country=country;
        this.bstate=bstate;
        this.baddress=baddress;
    }


}
