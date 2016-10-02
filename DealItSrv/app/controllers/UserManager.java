package controllers;

import java.util.ArrayList;

/**
 * Manages the requests related to User instances on the server.
 * Created by Jose A Rodriguez Rivera on 10/2/16.
 */
public class UserManager implements Manager<User>{
    //List of Users
    private ArrayList<User> userList;

    /**
     * Constructor. Creates dummy data for testing purposes.
     */
    public UserManager(){
        userList = new ArrayList<User>();
    }

    /**
     * Returns the Users on the server.
     * @return the Users on the server
     */
    public ArrayList<User> getAll(){
        return userList;
    }

    /**
     * Returns the User associated with the ID given (if any)
     * @param id the User ID
     * @return null if the User was not found
     * @return the User with the ID given
     */
    public User getByID(int id){
        if(id < 0 || id >= userList.size())
            return null;

        for(User e : userList)
            if(e.getID() == id)
                return e;
        return null;
    }

    /**
     * Adds an User to the server list.
     * @param us the User to add
     * @return 0, indicating no problems were had
     */
    public int add(User us){
        int newID;
        if(userList.isEmpty())
            newID = 0;
        else
            newID = userList.get(userList.size()-1).getID() + 1;


        userList.add(new User(newID, us.getName(), us.getPhoneNumber(), us.getCity(), us.getEmail()));
        return 0;
    }

    /**
     * Removes an User from the server list.
     * @param id the User ID
     * @return -1 if the User was not found
     * @return 0 if the User was successfully removed
     */
    public int remove(int id){
        if(id < 0 || id >= userList.size())
            return -1;

        for(int i = 0; i < userList.size(); i++)
            if(userList.get(i).getID() == id) {
                userList.remove(i);
                return 0;
            }
        return -1;
    }

    /**
     * Updates the User information.
     * @param us the User containing the updated info
     * @return -1 if the User was not found
     * @return 0 if the User was updated successfully
     */
    public int update(User us){
        for(User e : userList)
            if(e.getID() == us.getID()){
                e.updateName(us.getName());
                e.updatePhoneNumber(us.getPhoneNumber());
                e.updateCity(us.getCity());
                e.updateEmail(us.getEmail());
                return 0;
            }
        return -1;
    }

    /**
     * Returns the number of Users in the server list.
     * @return the number of Users
     */
    public int getNumberOfElements(){
        return userList.size();
    }
}
