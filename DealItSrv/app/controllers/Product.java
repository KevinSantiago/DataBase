package controllers;

/**
 * Created by Kevin Santiago Ortiz
 */
public class Product {
    private String productName;
    private int pid;
    private int cid;

    public Product(String productName, int pid, int cid) {
        this.productName = productName;
        this.pid = pid;
        this.cid = cid;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public int getPid() {
        return pid;
    }

    public void setPid(int pid) {
        this.pid = pid;
    }

    public int getCid() {
        return cid;
    }

    public void setCid(int cid) {
        this.cid = cid;
    }
}