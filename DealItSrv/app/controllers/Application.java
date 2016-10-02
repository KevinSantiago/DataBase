package controllers;

import com.fasterxml.jackson.databind.JsonNode;
import play.*;
import play.libs.Json;
import play.mvc.*;

/**
 * Created by Jose A Rodriguez Rivera on 10/2/16.
 */
public class Application extends Controller {

    private ItemManager itemManager = new ItemManager();

    public Result index(){
        return ok();
    }

    public Result getItems(){
        return ok(Json.toJson(itemManager.getItems()));
    }

    @BodyParser.Of(BodyParser.Json.class)
    public Result addItem(){
        JsonNode itemToAdd = request().body().asJson();
        if(itemToAdd.findPath("name").textValue() == null || itemToAdd.findPath("description").textValue() == null)
            return badRequest("Parameters missing!");

        Item ita = Json.fromJson(itemToAdd, Item.class);
        itemManager.addItem(ita);
        return ok("Item added successfully!");
    }

    @BodyParser.Of(BodyParser.Json.class)
    public Result updateItem(){
        JsonNode itemToUpdate = request().body().asJson();
        if(itemToUpdate.findPath("name").textValue() == null || itemToUpdate.findPath("description").textValue() == null)
            return badRequest("Parameters missing!");

        Item itu = Json.fromJson(itemToUpdate, Item.class);
        int status = itemManager.updateItem(itu);
        if(status < 0)
            return notFound();
        return ok("Item updated!");
    }

    public Result getItemByID(int id){
        Item itr = itemManager.getItemByID(id);
        if(itr == null)
            return notFound();

        return ok(Json.toJson(itr));

    }

    public Result deleteItemByID(int id){
        int status = itemManager.removeItem(id);
        if(status < 0)
            return notFound();

        return ok("Item successfully removed!");
    }
}
