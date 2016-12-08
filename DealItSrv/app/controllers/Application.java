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

    public Result getItemsPerCategory(String category){

        if(category != null){
            ItemManager itm = DBManager.getItemsPerCategory(category);
            return ok(Json.toJson(itm.getAll()));
        }
        else{
            return ok("Some Unexpected Error has Ocurred");
        }
    }


    public Result filterResults(String filter, String category){

        if(category != null && filter != null){
            ItemManager itm = DBManager.FilterResults(filter,category);
            return ok(Json.toJson(itm.getAll()));
        }
        else{
            return ok("Some Unexpected Error has Ocurred");
        }
    }
    /**
     * Get user info by account id
     */


    public Result getUserInfo(int aid){

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

    public Result getOrdersFromAccount(int aid){

        if(aid != 0){

            return ok(Json.toJson(DBManager.getOrdersFromAccount(aid)));
        }
        else{
            return ok("Some Unexpected Error has Ocurred");
        }
    }

    /**
     * Get all products under one account
     *
     */

    public Result getProductsFromUser(int aid){

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
         UserInfo info = new UserInfo(newUser.findPath("email").textValue(),1,newUser.findPath("ufirst").textValue(),
                 newUser.findPath("ulast").textValue(), newUser.findPath("ubirth").textValue(), newUser.findPath("ucity").textValue(),
                 newUser.findPath("ustate").textValue(), 1);

         return ok(DBManager.createUser(info).toString());
     }

     @BodyParser.Of(BodyParser.Json.class)
     public Result createAccount(){
         JsonNode info = request().body().asJson();
         return ok(DBManager.createAccount(info.findPath("uid").textValue()).toString());
     }

     @BodyParser.Of(BodyParser.Json.class)
     public Result createCred(){
         JsonNode info = request().body().asJson();
         Login cred = new Login(info.findPath("username").textValue(),info.findPath("password").textValue(),
                 Integer.parseInt(info.findPath("aid").textValue()));
         DBManager.createLoginCred(cred);
         return ok("Query executed successfully");
     }

     @BodyParser.Of(BodyParser.Json.class)
     public Result createPhone(){
         JsonNode info = request().body().asJson();
         DBManager.createPhone(Integer.parseInt(info.findPath("uid").textValue()),info.findPath("phone").textValue());
         return ok("Query executed successfully");
     }

     @BodyParser.Of(BodyParser.Json.class)
     public Result createCreditCard(){
         JsonNode info = request().body().asJson();
         CreditCard credit = new CreditCard(1,info.findPath("cnumber").textValue(),info.findPath("expDate").textValue(),
                 info.findPath("scode").textValue(),info.findPath("type").textValue(),info.findPath("bzip").textValue(),
                 info.findPath("bcity").textValue(),info.findPath("country").textValue(),info.findPath("bstate").textValue(),
                 info.findPath("baddress").textValue());
         DBManager.createCreditCard(credit, Integer.parseInt(info.findPath("aid").textValue()));
         return ok("Query executed successfully");
     }

     @BodyParser.Of(BodyParser.Json.class)
     public Result updateCreditCard(){
         JsonNode info = request().body().asJson();
         CreditCard credit = new CreditCard(1,info.findPath("cnumber").textValue(),info.findPath("expDate").textValue(),
                 info.findPath("scode").textValue(),info.findPath("type").textValue(),info.findPath("bzip").textValue(),
                 info.findPath("bcity").textValue(),info.findPath("country").textValue(),info.findPath("bstate").textValue(),
                 info.findPath("baddress").textValue());
         DBManager.updateCreditCard(credit, info.findPath("aid").intValue());
         return ok("Query executed successfully");
     }

     @BodyParser.Of(BodyParser.Json.class)
     public Result updatePhoneNumber(){
         JsonNode info = request().body().asJson();
         String phone = info.findPath("phone").textValue();
         int uid = info.findPath("uid").intValue();
         DBManager.updatePhoneNumber(phone,uid);
         return ok("Query executed successfully");
     }

     @BodyParser.Of(BodyParser.Json.class)
     public Result updateUserInfo(){
         JsonNode info = request().body().asJson();
         UserInfo user = new UserInfo(info.findPath("email").textValue(),1,info.findPath("ufirst").textValue(),
                 info.findPath("ulast").textValue(), info.findPath("ubirth").textValue(), info.findPath("ucity").textValue(),
                 info.findPath("ustate").textValue(), info.findPath("uid").intValue());
         DBManager.updateUserInfo(user);
         return ok("Query executed successfully");
     }

     @BodyParser.Of(BodyParser.Json.class)
     public Result insertOrder(){
         JsonNode info = request().body().asJson();

         return ok(DBManager.insertOrder(info.findPath("aid").intValue()).toString());
     }

     @BodyParser.Of(BodyParser.Json.class)
     public Result insertOrderLine(){
         JsonNode info = request().body().asJson();
         OrderLine line = new OrderLine(Integer.parseInt(info.findPath("oid").textValue()), info.findPath("pid").intValue(),
                 info.findPath("pname").textValue(),1);
         DBManager.insertOrderLine(line);
         return ok("Query executed successfully");
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
