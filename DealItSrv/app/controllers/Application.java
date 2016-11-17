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

    public Result loginUser(String password,String username){

        String logAlert;

        if((username != null) && (password != null)){
            Login cred = DBManager.getCredentials(username);
               if(cred != null){
                   if(cred.passwordMatch(password)){
                       int aid = cred.getAID();
                       logAlert = "Login Succesfull";
                       LoginManager status = DBManager.getLoginStatus(logAlert, true, aid);
                       return ok(Json.toJson(status));
                   }
                   else{
                       logAlert = "Password Doesn't Match";
                       LoginManager status = DBManager.getLoginStatus(logAlert, false, 0);
                       return ok(Json.toJson(status));
                   }
               }
               else{
                   logAlert = "Not valid username!";
                   LoginManager status = DBManager.getLoginStatus(logAlert, false, 0);
                   return ok(Json.toJson(status));
               }
        }
        else{
            logAlert = "Not valid credentials!";
            LoginManager status = DBManager.getLoginStatus(logAlert, false, 0);
            return ok(Json.toJson(status));
        }
    }

    /**
     * Get items by category
     */
   // @BodyParser.Of(BodyParser.Json.class)
    public Result getItemsPerCategory(String category){
       // JsonNode info = request().body().asJson();
       // String category = info.findPath("category").textValue();
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


    public Result getPhoneNumbers(int uid){

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

    public Result getCreditCard(int aid){

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

    public Result getProductOwnerInfo(int pid){

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

    public Result getFeedbackFromProduct(int pid){

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

    public Result getProductInfo(int pid){

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
        Item itr = DBManager.getProductInfo(id);
        if(itr == null)
            return notFound("tem not found!\n");

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
