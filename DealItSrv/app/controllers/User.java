package controllers;

/**
 * Represents the Users on the server.
 * Created by Jose A Rodriguez Rivera on 10/2/16.
 */
public class User {
    private int uid;
    private String username;
    private String email;
    private UserInfo info;

    /**
     * Default Constructor
     */
    public User(){}

    /**
     * Constructor. Creates an instance of User.
     * @param id the User id
     * @param username the username of the User
     * @param email the email of the user
     * @param info the UserInfo instance associated with the User
     */
    public User(int id, String username, String email, UserInfo info){
        this.uid = id;
        this.username = username;
        this.email = email;
        this.info = info;
    }

    /**
     * Returns the username of the User.
     * @return the username of the User.
     */
    public String getUsername(){
        return this.username;
    }

    /**
     * Return the User's email.
     * @return the User's email
     */
    public String getEmail(){
        return this.email;
    }

    /**
     * Return the User's id
     * @return the User's id
     */
    public int getID(){
        return this.uid;
    }

    /**
     * Updates the User's username.
     * @param username the User's new username
     */
    public void updateUsername(String username){
        this.username = username;
    }


    /**
     * Updates the User's email.
     * @param email the User's new email
     */
    public void updateEmail(String email){
        this.email = email;
    }


    public UserInfo getInfo() {
        return info;
    }

    public void setInfo(UserInfo info) {
        this.info = info;
    }
}
