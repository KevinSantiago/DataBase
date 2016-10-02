package controllers;

import java.util.ArrayList;
import play.mvc.*;

/**
 * Created by Jose A Rodriguez Rivera on 10/2/16.
 */
public class ItemManager {
    private ArrayList<Item> itemList;

    public ItemManager(){
        itemList = new ArrayList<Item>();
        User testUser = new User("John Doe", "787-123-4567", "Mayagüez", "john.doe@gmail.com");

        itemList.add(new Item(0, "A", ":^)", 1.23, testUser, false));
        itemList.add(new Item(1, "zb", ":^)", 21.23, testUser, false));
        itemList.add(new Item(2, "C", ":^)", 18.23, testUser, false));
        itemList.add(new Item(3, "D", ":^)", 11.23, testUser, false));
        itemList.add(new Item(4, "E", ":^)", 18.23, testUser, false));
        itemList.add(new Item(5, "R", ":^)", 91.23, testUser, false));
        itemList.add(new Item(6, "G", ":^)", 10.23, testUser, false));
        itemList.add(new Item(7, "W", ":^)", 112.23, testUser, false));
        itemList.add(new Item(8, "U", ":^)", 154.23, testUser, false));
    }

    public ArrayList<Item> getItems(){
        return itemList;
    }

    public Item getItemByID(int id){
        if(id < 0 || id >= itemList.size())
            return null;

        for(Item e : itemList)
            if(e.getID() == id)
                return e;
        return null;
    }

    public int addItem(Item it){
        int newID;
        if(itemList.isEmpty())
            newID = 0;
        else
            newID = itemList.get(itemList.size()-1).getID() + 1;


        itemList.add(new Item(newID, it.getName(), it.getDescription(), it.getPrice(), it.getSeller(), false));
        return 0;
    }

    public int removeItem(int id){
        if(id < 0 || id >= itemList.size())
            return -1;

        for(int i = 0; i < itemList.size(); i++)
            if(itemList.get(i).getID() == id) {
                itemList.get(i).setSellStatus(true);
                itemList.remove(i);
                return 0;
            }
        return -1;
    }

    public int updateItem(Item it){
        for(Item e : itemList)
            if(e.getID() == it.getID()){
                e.updateName(it.getName());
                e.updateDescription(it.getDescription());
                e.updatePrice(it.getPrice());
                return 0;
            }
        return -1;
    }

    public int getNumberOfItems(){
        return itemList.size();
    }
}
