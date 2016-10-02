package controllers;

import java.awt.*;

/**
 * Created by Jose A Rodriguez Rivera on 10/2/16.
 */
public class Item {
    private int id;
    private String name;
    private String description;
    private double price;
    private User seller;
    private boolean isSold;
    private Image image; //Any ideas??


    public Item(int id, String name, String description, double price, User seller, boolean isSold){
        this.id = id;
        this.name = name;
        this.description = description;
        this.price = price;
        this.seller = seller;
        this.isSold = isSold;
    }

    public int getID(){
        return this.id;
    }

    public String getName(){
        return this.name;
    }

    public String getDescription(){
        return this.description;
    }

    public double getPrice(){
        return this.price;
    }

    public void updateName(String name){
       this.name = name;
   }

    public void updateDescription(String description){
       this.description = description;
   }

    public void updatePrice(double price){
       this.price = price;
   }

    public boolean isSold(){
        return this.isSold;
    }

    public void setSellStatus(boolean isSold){
        this.isSold = isSold;
    }

    public User getSeller(){
        return this.seller;
    }

}
