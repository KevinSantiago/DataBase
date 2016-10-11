package controller;

/**
 * Created by Kevin Santiago
 */
public class ProductDetail {
    private int pid;
    private float price;
    private String comment;
    private int productYear;
    private String brand;
    private String conditions;

    public ProductDetail(int pid, float price, String comment, int productYear, String brand, String conditions) {
        this.pid = pid;
        this.price = price;
        this.comment = comment;
        this.productYear = productYear;
        this.brand = brand;
        this.conditions = conditions;
    }

    public int getPid() {
        return pid;
    }

    public void setPid(int pid) {
        this.pid = pid;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    public int getProductYear() {
        return productYear;
    }

    public void setProductYear(int productYear) {
        this.productYear = productYear;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getConditions() {
        return conditions;
    }

    public void setConditions(String conditions) {
        this.conditions = conditions;
    }
}