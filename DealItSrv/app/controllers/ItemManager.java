package controllers;

import java.util.ArrayList;
import play.mvc.*;

/**
 * Manages the requests related to Item instances on the server.
 * Created by Jose A Rodriguez Rivera on 10/2/16.
 */
public class ItemManager implements Manager<Item>{
    //List of Items
    private ArrayList<Item> itemList;


    /**
     * Constructor. Creates dummy data for testing purposes.
     */
    public ItemManager(){
        itemList = new ArrayList<Item>();
    }

    /**
     * Returns the Items on the server.
     * @return the Items on the server
     */
    public ArrayList<Item> getAll(){
        return itemList;
    }

    /**
     * Returns the Item associated with the ID given (if any)
     * @param id the Item ID
     * @return null if the Item was not found
     * @return the Item with the ID given
     */
    public Item getByID(int id){
        if(id < 0 || id >= itemList.size())
            return null;

        for(Item e : itemList)
            if(e.getID() == id)
                return e;
        return null;
    }

    /**
     * Adds an Item to the server list.
     * @param it the Item to add
     * @return 0, indicating no problems were had
     */
    public int add(Item it){

        itemList.add(it);
        return 0;
    }

    /**
     * Removes an Item from the server list.
     * @param id the Item ID
     * @return -1 if the Item was not found
     * @return 0 if the Item was successfully removed
     */
    public int remove(int id){
        if(id < 0 || id >= itemList.size())
            return -1;

        for(int i = 0; i < itemList.size(); i++)
            if(itemList.get(i).getID() == id) {
                itemList.remove(i);
                return 0;
            }
        return -1;
    }

    /**
     * Updates the Item information.
     * @param it the Item containing the updated info
     * @return -1 if the Item was not found
     * @return 0 if the Item was updated successfully
     */
    public int update(Item it){
        for(Item e : itemList)
            if(e.getID() == it.getID()){
                e.updateItem(it.getItem());
                e.updateCondition(it.getCondition());
                e.updatePrice(it.getPrice());
                return 0;
            }
        return -1;
    }

    /**
     * Returns the number of Items in the server list.
     * @return the number of Items
     */
    public int getNumberOfElements(){
        return itemList.size();
    }

    /**
     * Returns the Cars currently on the server list.
     * @return the Cars currently on the server list
     */
    public ArrayList<Item> getCarItems(){
        ArrayList<Item> atr = new ArrayList<>();
        for(Item i : itemList){
            if(i.getCategory().equals("car"))
                atr.add(i);
        }
        return atr;
    }

    /**
     * Returns the Houses currently on the server list.
     * @return the Houses currently on the server list
     */
    public ArrayList<Item> getHouseItems(){
        ArrayList<Item> atr = new ArrayList<>();
        for(Item i : itemList){
            if(i.getCategory().equals("house"))
                atr.add(i);
        }
        return atr;
    }

    /**
     * Returns the Furniture currently on the server list.
     * @return the Furniture currently on the server list
     */
    public ArrayList<Item> getFurnitureItems(){
        ArrayList<Item> atr = new ArrayList<>();
        for(Item i : itemList){
            if(i.getCategory().equals("furniture"))
                atr.add(i);
        }
        return atr;
    }

    /**
     * Returns the Technology currently on the server list.
     * @return the Technology currently on the server list
     */
    public ArrayList<Item> getTechnologyItems(){
        ArrayList<Item> atr = new ArrayList<>();
        for(Item i : itemList){
            if(i.getCategory().equals("technology"))
                atr.add(i);
        }
        return atr;
    }

}
