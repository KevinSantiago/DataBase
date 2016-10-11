package controllers;

/**
 * Created by Kevin Santiago
 */
public class Category{
    private int cid;
    private String categoryName;
    private String description;

    public Category(int cid, String categoryName, String description) {
        this.cid = cid;
        this.categoryName = categoryName;
        this.description = description;
    }

    public int getCid() {
        return cid;
    }

    public void setCid(int cid) {
        this.cid = cid;
    }

    public String getCategoryName() {
        return categoryName;
    }

    public void setCategoryName(String categoryName) {
        this.categoryName = categoryName;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}