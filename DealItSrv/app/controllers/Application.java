package controllers;

import com.fasterxml.jackson.databind.JsonNode;
import play.libs.Json;
import play.mvc.*;
import java.util.*;
import java.util.Calendar;
import java.util.Date;

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


        return ok("Successful init\n");
    }


	/**
     * Submit user credentials .Expects the user credentials in JSON format.
     * @return Status depending on request outcome
     */
    @BodyParser.Of(BodyParser.Json.class)
    public Result loginUser(){

        JsonNode user = request().body().asJson();
        String username = user.findPath("email").textValue();
        String password = user.findPath("password").textValue();
        if((username != null) && (password != null)){
            Login cred = DBManager.getCredentials(username);
               if(cred != null){
                   if(cred.passwordMatch(password)){
                       return ok("Login successfully");
                   }
                   else{
                       return ok("Password Doesn't Match");
                   }
               }
               else{
                   return ok("Not valid username!");
               }
        }
        else{
            return ok("Not valid credentials!");
        }
    }

    /**
     * Get items by category
     */
    @BodyParser.Of(BodyParser.Json.class)
    public Result getItemsPerCategory(){
        JsonNode info = request().body().asJson();
        String category = info.findPath("category").textValue();
        if(category != null){
            ItemManager itm = DBManager.getItemsPerCategory(category);
            return ok(Json.toJson(itm.getAll()));
        }
        else{
            return ok("Some Unexpected Error has Ocurred");
        }
    }

    /**
     * Get user info by account id
     */

    @BodyParser.Of(BodyParser.Json.class)
    public Result getUserInfo(){
        JsonNode info = request().body().asJson();
        int aid = info.findPath("aid").intValue();
        if(aid != 0){
            UserInfo user_info = DBManager.getUserInfo(aid);
            return ok(Json.toJson(user_info));
        }
        else{
            return ok("Some Unexpected Error has Ocurred");
        }
    }

    /**
     * Get users phone numbers
     */

    @BodyParser.Of(BodyParser.Json.class)
    public Result getPhoneNumbers(){

        JsonNode info = request().body().asJson();
        int uid = info.findPath("uid").intValue();

        if(uid != 0){
            return ok(Json.toJson(DBManager.getPhoneNumbers(uid)));
        }
        else{
            return ok("Some Unexpected Error has Ocurred");
        }
    }

    /**
     * Get user credit card info
     */
    @BodyParser.Of(BodyParser.Json.class)
    public Result getCreditCard(){

        JsonNode info = request().body().asJson();
        int aid = info.findPath("aid").intValue();

        if(aid != 0){
            CreditCard credit_card = DBManager.getCreditCard(aid);
            return ok(Json.toJson(credit_card));

        }
        else{
            return ok("Some Unexpected Error has Ocurred");
        }
    }

    /**
     * Get product owner info
     *
     */
    @BodyParser.Of(BodyParser.Json.class)
    public Result getProductOwnerInfo(){
        JsonNode info = request().body().asJson();
        int pid = info.findPath("pid").intValue();
        if(pid != 0){
            UserInfo user_info = DBManager.getOwnerOfProductInfo(pid);
            return ok(Json.toJson(user_info));
        }
        else{
            return ok("Some Unexpected Error has Ocurred");
        }
    }

    /**
     * Get Feedback from product
     */
    @BodyParser.Of(BodyParser.Json.class)
    public Result getFeedbackFromProduct(){
        JsonNode info = request().body().asJson();
        int pid = info.findPath("pid").intValue();
        if(pid != 0){
            return ok(Json.toJson(DBManager.getFeedback(pid)));
        }
        else{
            return ok("Some Unexpected Error has Ocurred");
        }
    }

    /**
     * Get item info by their pid
     */
    @BodyParser.Of(BodyParser.Json.class)
    public Result getProductInfo(){
        JsonNode info = request().body().asJson();
        int pid = info.findPath("pid").intValue();

        if(pid != 0){
            Item itr = DBManager.getProductInfo(pid);
            return ok(Json.toJson(itr));
        }
        else{
            return ok("Some Unexpected Error has Ocurred");
        }
    }

    /**
     * Get order content
     */
    @BodyParser.Of(BodyParser.Json.class)
    public Result getOrderContent(){
        JsonNode info = request().body().asJson();
        int oid = info.findPath("oid").intValue();

        if(oid != 0){
            return ok(Json.toJson(DBManager.getOrderContent(oid)));
        }
        else{
            return ok("Some Unexpected Error has Ocurred");
        }
    }

    /**
     * Get Orders Bind to an Account
     */
    @BodyParser.Of(BodyParser.Json.class)
    public Result getOrdersFromAccount(){
        JsonNode info = request().body().asJson();
        int aid = info.findPath("aid").intValue();
        if(aid != 0){
            Order otr = DBManager.getOrdersFromAccount(aid);
            return ok(Json.toJson(otr));
        }
        else{
            return ok("Some Unexpected Error has Ocurred");
        }
    }

    /**
     * Get all products under one account
     *
     */
    @BodyParser.Of(BodyParser.Json.class)
    public Result getProductsFromUser(){
        JsonNode info = request().body().asJson();
        int aid = info.findPath("aid").intValue();
        if(aid != 0){
            ItemManager itm = DBManager.getItemsBindToAccount(aid);
            return ok(Json.toJson(itm.getAll()));
        }
        else{
            return ok("Some Unexpected Error has Ocurred");
        }
    }


    /**
     * Submit new user credentials. Expects the new user credentials in JSON format.
     * @return Status depending on request outcome
     */
     @BodyParser.Of(BodyParser.Json.class)
     public Result createUser(){
         JsonNode newUser = request().body().asJson();
         if(newUser.findPath("name").textValue() == null || newUser.findPath("bdate").textValue() == null || newUser.findPath("email").textValue() == null || newUser.findPath("password").textValue() == null)
               return badRequest("Parameters missing!");

         return ok("Welcome to our community!\n"+newUser.findPath("name").textValue());
     }

    /**
     * Returns the Item on the server associated with the ID given.
     * @param id the id of the Item
     * @return Status code depending on request outcome. If ok, returns the Item in JSON format
     */
    public Result getItemByID(int id){
        Item itr = itemManager.getByID(id);
        if(itr == null)
            return notFound("Invalid ID. Item not found!\n");

        return ok(Json.toJson(itr));

    }


    /**
     * Login process.
     * @return Status code depending on request outcome
     */
    public Result login(){
        return ok("Login Successful!\n");     //For testing purposes
    }

    /**
     * Logout process.
     * @return Status code depending on request outcome
     */
    public Result logout(){
        return ok("Logout successful!\n");    //For testing purposes
    }

    /**
     * Sign up process.
     * @return Status code depending on request outcome
     */
    public Result signup(){
        return ok("Sign Up Successful!\n"); //For testing purposes
      }




}
