package controllers;

import java.awt.*;

/**
 * Represents an Item on the server.
 * Created by Jose A Rodriguez Rivera on 10/2/16.
 */
public class Item {
    private int id;
    private String name;
    private String description;
    private double price;
    private User seller;
    private boolean isSold;
    private String category;


    /**
     * Default constructor.
     */
    public Item(){}


    /**
     * Constructor. Creates an instance of Item.
     * @param id the id of the Item
     * @param name the name of the Item
     * @param description the description of the Item
     * @param price the price of the Item
     * @param seller the User that is selling the Item
     * @param isSold boolean variable representing sell status (sold/unsold)
     * @param category the Item's category
     */
    public Item(int id, String name, String description, String category, double price, User seller, boolean isSold){
        this.id = id;
        this.name = name;
        this.description = description;
        this.category = category;
        this.price = price;
        this.seller = seller;
        this.isSold = isSold;
    }

    /**
     * Returns the ID of this Item.
     * @return the ID of this Item
     */
    public int getID(){
        return this.id;
    }

    /**
     * Returns the name of this Item.
     * @return the name of this Item.
     */
    public String getName(){
        return this.name;
    }


    /**
     * Returns the description for this Item.
     * @return the description for this Item
     */
    public String getDescription(){
        return this.description;
    }

    /**
     * Returns the Item's category.
     * @return the item category
     */
    public String getCategory(){
        return this.category;
    }
    /**
     * Returns the price of this Item.
     * @return the price of this Item
     */
    public double getPrice(){
        return this.price;
    }

    /**
     * Updates the name of this Item.
     * @param name the new name for the Item
     */
    public void updateName(String name){
       this.name = name;
   }

    /**
     * Updates the description for this Item.
     * @param description the new description for this Item
     */
    public void updateDescription(String description){
       this.description = description;
   }

    /**
     * Updates the price of this Item.
     * @param price the price of this Item
     */
    public void updatePrice(double price){
       this.price = price;
   }

    /**
     * Returns if the Item was sold or not.
     * @return true if the Item was sold
     */
    public boolean isSold(){
        return this.isSold;
    }

    /**
     * Sets the sell status of the Item.
     * @param isSold true if the Item was sold
     */
    public void setSellStatus(boolean isSold){
        this.isSold = isSold;
    }

    /**
     * Returns the User that is selling the Item.
     * @return this Item's seller
     */
    public User getSeller(){
        return this.seller;
    }

}
