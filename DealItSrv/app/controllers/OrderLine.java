package controllers;

import java.util.Date;

/**
 * Created by Kevin Santiago
 */
public class OrderLine{
    public int oid;
    public int pid;
    public String pname;
    public int quantity;


    public OrderLine(int oid, int pid, String pname, int quantity) {
        this.oid = oid;
        this.pid = pid;
        this.pname= pname;
        this.quantity=quantity;
    }

    public int getOid() {
        return oid;
    }

    public int getPid() {
        return pid;
    }

    public String getPname() {
        return pname;
    }

    public int getQuantity() {
        return quantity;
    }
}