package controllers;

import java.awt.*;

/**
 * Represents an Item on the server.
 * Created by Jose A Rodriguez Rivera on 10/2/16.
 */
public class Item {
    private int pid;
    private String item;
    private String brand;
    private float price;
    private String category;
    private String condition;


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
    public Item(int pid, String item, String brand, String category, float price, String condition){
        this.pid = pid;
        this.item = item;
        this.brand = brand;
        this.category = category;
        this.price = price;
        this.condition = condition;

    }

    /**
     * Returns the ID of this Item.
     * @return the ID of this Item
     */
    public int getID(){
        return this.pid;
    }

    /**
     * Returns the name of this Item.
     * @return the name of this Item.
     */
    public String getItem(){
        return this.item;
    }


    /**
     * Returns the description for this Item.
     * @return the description for this Item
     */
    public String getCondition(){
        return this.condition;
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
    public float getPrice(){
        return this.price;
    }

    public String getBrand(){ return this.brand;}
    /**
     * Updates the name of this Item.
     * @param name the new name for the Item
     */
    public void updateItem(String name){
       this.item= name;
   }

    /**
     * Updates the description for this Item.
     * @param description the new description for this Item
     */
    public void updateCondition(String description){
       this.condition = condition;
   }

    /**
     * Updates the price of this Item.
     * @param price the price of this Item
     */
    public void updatePrice(float price){
       this.price = price;
   }







}
