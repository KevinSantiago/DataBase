package controllers;

/**
 * Created by Kevin Santiago
 */
public class Order{
    public int oid;
    public String ctype;
    public String cnumber;
    public String date;


    public Order(int oid, String ctype, String cnumber, String date) {
        this.oid = oid;
        this.ctype = ctype;
        this.cnumber = cnumber;
        this.date = date;
    }

    public int getOid() {
        return oid;
    }

    public String getCtype() {
        return ctype;
    }

    public String getCnumber() {
        return cnumber;
    }

    public String getDate() {
        return date;
    }
}

