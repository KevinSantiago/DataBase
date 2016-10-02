package controllers;

import com.fasterxml.jackson.databind.JsonNode;
import play.libs.Json;
import play.mvc.*;

/**
 * Receives the requests and calls the appropriate Manager class to process it and returns the status code.
 * Created by Jose A Rodriguez Rivera on 10/2/16.
 */
public class Application extends Controller {

    //Creates a new UserManager
    private UserManager userManager;
    //Creates a new ItemManager
    private ItemManager itemManager;

    //Index
    public Result index(){
        userManager = new UserManager();
        itemManager = new ItemManager();

        User testUser = new User(0, "John Doe", "787-123-4567", "Mayaguez", "john.doe@gmail.com");
        userManager.add(testUser);

        Item testItem1 = new Item(0, "A", ":)", 12.34, testUser, false);
        Item testItem2 = new Item(1, "B", ":)", 22.34, testUser, false);
        Item testItem3 = new Item(2, "C", ":)", 26.34, testUser, false);
        Item testItem4 = new Item(3, "D", ":)", 2.84, testUser, false);
        Item testItem5 = new Item(4, "E", ":)", 72.34, testUser, false);

        itemManager.add(testItem1);
        itemManager.add(testItem2);
        itemManager.add(testItem3);
        itemManager.add(testItem4);
        itemManager.add(testItem5);

        return ok();
    }

    /**
     * Returns all the items in the server.
     * @return Status code "ok" with all items in JSON format.
     */
    public Result getItems(){
        return ok(Json.toJson(itemManager.getAll()));
    }

    /**
     * Adds an item to the server item list. Expects an Item object in JSON format.
     * @return Status code depending on request outcome
     */
    @BodyParser.Of(BodyParser.Json.class)
    public Result addItem(){
        JsonNode itemToAdd = request().body().asJson();
        if(itemToAdd.findPath("name").textValue() == null || itemToAdd.findPath("description").textValue() == null)
            return badRequest("Parameters missing!");

        Item ita = Json.fromJson(itemToAdd, Item.class);
        itemManager.add(ita);
        return ok("Item added successfully!");
    }

    /**
     * Updates an existing Item on the server. Expects an Item object in JSON format.
     * @return Status code depending on request outcome
     */
    @BodyParser.Of(BodyParser.Json.class)
    public Result updateItem(){
        JsonNode itemToUpdate = request().body().asJson();
        if(itemToUpdate.findPath("name").textValue() == null || itemToUpdate.findPath("description").textValue() == null)
            return badRequest("Parameters missing!");

        Item itu = Json.fromJson(itemToUpdate, Item.class);
        int status = itemManager.update(itu);
        if(status < 0)
            return notFound();
        return ok("Item updated!");
    }

    /**
     * Returns the Item on the server associated with the ID given.
     * @param id the id of the Item
     * @return Status code depending on request outcome. If ok, returns the Item in JSON format
     */
    public Result getItemByID(int id){
        Item itr = itemManager.getByID(id);
        if(itr == null)
            return notFound();

        return ok(Json.toJson(itr));

    }

    /**
     * Deletes an Item associated with the ID given from the server.
     * @param id the id of the Item
     * @return Status code depending on request outcome
     */
    public Result deleteItemByID(int id){
        int status = itemManager.remove(id);
        if(status < 0)
            return notFound();

        return ok("Item successfully removed!");
    }

    /**
     * Returns all the users in the server.
     * @return Status code "ok" with all users in JSON format.
     */
    public Result getUsers(){
        return ok(Json.toJson(userManager.getAll()));
    }

    /**
     * Adds an user to the server user list. Expects an User object in JSON format.
     * @return Status code depending on request outcome
     */
    @BodyParser.Of(BodyParser.Json.class)
    public Result addUser(){
        JsonNode userToAdd = request().body().asJson();
        if(userToAdd.findPath("name").textValue() == null
                || userToAdd.findPath("phoneNumber").textValue() == null
                || userToAdd.findPath("city").textValue() == null
                || userToAdd.findPath("email").textValue() == null)
            return badRequest("Parameters missing!");

        User uta = Json.fromJson(userToAdd, User.class);
        userManager.add(uta);
        return ok("User added successfully!");
    }

    /**
     * Updates an existing User on the server. Expects an User object in JSON format.
     * @return Status code depending on request outcome
     */
    @BodyParser.Of(BodyParser.Json.class)
    public Result updateUser(){
        JsonNode userToUpdate = request().body().asJson();
        if(userToUpdate.findPath("name").textValue() == null
                || userToUpdate.findPath("phoneNumber").textValue() == null
                || userToUpdate.findPath("city").textValue() == null
                || userToUpdate.findPath("email").textValue() == null)
            return badRequest("Parameters missing!");

        User utu = Json.fromJson(userToUpdate, User.class);
        int status = userManager.update(utu);
        if(status < 0)
            return notFound();
        return ok("User updated!");
    }

    /**
     * Returns the User on the server associated with the ID given.
     * @param id the id of the User
     * @return Status code depending on request outcome. If ok, returns the User in JSON format
     */
    public Result getUserByID(int id){
        User utr = userManager.getByID(id);
        if(utr == null)
            return notFound();

        return ok(Json.toJson(utr));

    }

    /**
     * Deletes an User associated with the ID given from the server.
     * @param id the id of the User
     * @return Status code depending on request outcome
     */
    public Result deleteUserByID(int id){
        int status = userManager.remove(id);
        if(status < 0)
            return notFound();

        return ok("User successfully removed!");
    }

    /**
     * Login process.
     * @return Status code depending on request outcome
     */
    public Result login(){
        return ok("Login Successful!");     //For testing purposes
    }

    /**
     * Logout process.
     * @return Status code depending on request outcome
     */
    public Result logout(){
        return ok("Logout successful!");    //For testing purposes
    }
}
