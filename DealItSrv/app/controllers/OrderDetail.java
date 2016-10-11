package controllers;

import java.util.Date;

/**
 * Created by Kevin Santiago
 */
public class OrderDetail{
    private int oid;
    private int pid;
    private Date orderDate;
    private int quantity;
    private CreditCard creditCard;

    public OrderDetail(int oid, int pid, Date orderDate, int quantity, CreditCard creditCard) {
        this.oid = oid;
        this.pid = pid;
        this.orderDate = orderDate;
        this.quantity = quantity;
        this.creditCard = creditCard;
    }

    public int getOid() {
        return oid;
    }

    public void setOid(int oid) {
        this.oid = oid;
    }

    public int getPid() {
        return pid;
    }

    public void setPid(int pid) {
        this.pid = pid;
    }

    public Date getOrderDate() {
        return orderDate;
    }

    public void setOrderDate(Date orderDate) {
        this.orderDate = orderDate;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public CreditCard getCreditCard() {
        return creditCard;
    }

    public void setCreditCard(CreditCard creditCard) {
        this.creditCard = creditCard;
    }
}