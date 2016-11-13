package controllers;


import javax.inject.Inject;
import java.sql.*;
import play.mvc.*;
import play.db.*;


public class DBManager extends Controller{


    class JavaApplicationDatabase extends Controller {

        private Database db;

        @Inject
        public JavaApplicationDatabase(Database db) {
            this.db = db;
        }


    }

    public static Login getCredentials(String username){
        Connection cdb= DB.getConnection();
        Login credentials = null;
        if(cdb!=null){
            PreparedStatement ps = null;
            String sql="select * from login_cred where username=?";
            try{
                ps=cdb.prepareStatement(sql);
                ps.setString(1,username);
                ResultSet rs = ps.executeQuery();
                while(rs.next()){

                    String user = rs.getString("username");
                    String password= rs.getString("_password");
                    int aid= rs.getInt("aid");
                    credentials = new Login(user,password,aid);
                }
            }catch(Exception e){
                System.out.println(e);
            }
        }
        return credentials;
    }

    public static ItemManager getItemsPerCategory(String category){
        Connection cdb = DB.getConnection();
        ItemManager itm = new ItemManager();
        if(cdb!=null){

            PreparedStatement ps = null;
            String sql="select pname as item, brand, conditions, price,pid\n" +
                    "from product natural join category\n" +
                    "where cname= ?";

            try {
                ps=cdb.prepareStatement(sql);
                ps.setString(1,category);
                ResultSet rs = ps.executeQuery();
                while(rs.next()){
                    String item = rs.getString("item");
                    String brand = rs.getString("brand");
                    String condition = rs.getString("conditions");
                    float price = rs.getFloat("price");
                    int pid = rs.getInt("pid");
                    itm.add(new Item(pid,item,brand,category,price,condition));
                }
            }catch(Exception e){
                System.out.println(e);
            }
        }
        return itm;


    }

}