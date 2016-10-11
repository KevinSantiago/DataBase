package controllers;

/**
 * Created by Kevin Santiago
 */
public class Order{
    private int oid;
    private String username;

    public Order(int oid, String username) {
        this.oid = oid;
        this.username = username;
    }

    public int getOid() {
        return oid;
    }

    public void setOid(int oid) {
        this.oid = oid;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }
}

