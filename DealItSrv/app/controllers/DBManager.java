package controllers;


import javax.inject.Inject;
import java.sql.*;
import play.mvc.*;
import play.db.*;
import java.util.*;

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
                cdb.close();
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
            String sql="select pname as item, brand, conditions, price,pid,img_url,description\n" +
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
                    String img_url= rs.getString("img_url");
                    String description= rs.getString("description");
                    itm.add(new Item(pid,item,brand,category,price,condition,img_url,description));
                }
                cdb.close();
            }catch(Exception e){
                System.out.println(e);
            }
        }
        return itm;


    }

    public static ItemManager FilterResults(String filter, String category){
        Connection cdb = DB.getConnection();
        ItemManager itm = new ItemManager();
        String fs = "%"+filter+"%";
        if(cdb!=null){

            PreparedStatement ps = null;
            String sql="select pname as item, brand, conditions, price,pid,img_url,description\n" +
                    " from product natural join category\n" +
                    "  where cname=? and\n" +
                    "  pname like ?";

            try {
                ps=cdb.prepareStatement(sql);
                ps.setString(1,category);
                ps.setString(2,fs);
                ResultSet rs = ps.executeQuery();
                while(rs.next()){
                    String item = rs.getString("item");
                    String brand = rs.getString("brand");
                    String condition = rs.getString("conditions");
                    float price = rs.getFloat("price");
                    int pid = rs.getInt("pid");
                    String img_url= rs.getString("img_url");
                    String description= rs.getString("description");
                    itm.add(new Item(pid,item,brand,category,price,condition,img_url,description));
                }
                cdb.close();
            }catch(Exception e){
                System.out.println(e);
            }
        }
        return itm;


    }

    public static ItemManager getItemsBindToAccount(int aid){
        Connection cdb = DB.getConnection();
        ItemManager itm = new ItemManager();
        if(cdb!=null){

            PreparedStatement ps = null;
            String sql="select pid,pname as item,price,conditions,brand,cname as _category,img_url,description\n" +
                    "from account natural join product natural join category\n" +
                    "where aid=?";

            try{
                ps = cdb.prepareStatement(sql);
                ps.setInt(1,aid);
                ResultSet rs = ps.executeQuery();
                while(rs.next()){
                    String item = rs.getString("item");
                    int pid = rs.getInt("pid");
                    String condition = rs.getString("conditions");
                    float price = rs.getFloat("price");
                    String brand = rs.getString("brand");
                    String category = rs.getString("_category");
                    String img_url = rs.getString("img_url");
                    String description = rs.getString("description");
                    itm.add(new Item(pid,item,brand,category,price,condition,img_url,description));
                }
                cdb.close();
            }catch(Exception e){
                System.out.println(e);
            }
        }
        return itm;
    }

    public static Item getProductInfo(int pid){
        Connection cdb = DB.getConnection();
        Item itr= null;
        if(cdb!=null){
            PreparedStatement ps = null;
            String sql="select pname as item, price, conditions, brand, cname as _category,img_url,description \n"+
                    "from product natural join category\n"+
                    "where pid=?";

            try{
                ps = cdb.prepareStatement(sql);
                ps.setInt(1,pid);
                ResultSet rs = ps.executeQuery();
                while(rs.next()){
                    String item = rs.getString("item");
                    String condition = rs.getString("conditions");
                    float price = rs.getFloat("price");
                    String brand = rs.getString("brand");
                    String category = rs.getString("_category");
                    String img_url = rs.getString("img_url");
                    String description = rs.getString("description");
                    itr = new Item(pid,item,brand,category,price,condition,img_url,description);
                }
                cdb.close();
            }catch(Exception e){
                System.out.println(e);
            }
        }
        return itr;
    }

    public static ArrayList<Order> getOrdersFromAccount(int aid){
        Connection cdb = DB.getConnection();
        Order otr = null;
        ArrayList<Order> otm = new ArrayList<Order>();
        if(cdb!=null){
            PreparedStatement ps = null;
            String sql="select oid,ctype,cnumber,_date\n" +
                    "from account natural join orders natural join credit_card\n" +
                    "where aid=?";

            try{
                ps = cdb.prepareStatement(sql);
                ps.setInt(1,aid);
                ResultSet rs = ps.executeQuery();
                while(rs.next()){
                    int oid = rs.getInt("oid");
                    String ctype = rs.getString("ctype");
                    String cnumber = rs.getString("cnumber");
                    String date = rs.getString("_date");
                    otm.add(new Order(oid,ctype,cnumber, date));
                }
                cdb.close();
            }catch(Exception e){
                System.out.println(e);
            }
        }
        return otm;
    }

    public static ArrayList<OrderLine> getOrderContent(int oid){
        Connection cdb = DB.getConnection();
        ArrayList<OrderLine> order = new ArrayList<OrderLine>();
        if(cdb!=null){
            PreparedStatement ps = null;
            String sql="select oid,pid,pname,quantity\n" +
                    "from order_line natural join product \n" +
                    "where oid=?";

            try{
                ps = cdb.prepareStatement(sql);
                ps.setInt(1,oid);
                ResultSet rs = ps.executeQuery();

                while(rs.next()){
                    int pid = rs.getInt("pid");
                    String pname = rs.getString("pname");
                    int quantity = rs.getInt("quantity");
                    order.add(new OrderLine(oid, pid, pname,quantity));
                }
                cdb.close();
            }catch(Exception e){
                System.out.println(e);
            }
        }
        return order;
    }

    public static UserInfo getOwnerOfProductInfo(int pid){
        Connection cdb = DB.getConnection();
        UserInfo user_info = null;
        if(cdb != null){

            PreparedStatement ps = null;
            String sql = "select uid,aid,ufirst,ulast,ucity,ustate,uemail,ubirth\n"+
                    "from product natural join account natural join users\n"+
                    "where pid=?";

            try{
                ps = cdb.prepareStatement(sql);
                ps.setInt(1,pid);
                ResultSet rs = ps.executeQuery();
                while(rs.next()){
                    String name= rs.getString("ufirst");
                    String lastname= rs.getString("ulast");
                    String city= rs.getString("ucity");
                    String state = rs.getString("ustate");
                    String email= rs.getString("uemail");
                    String birth = rs.getString("ubirth");
                    int uid = rs.getInt("uid");
                    int aid = rs.getInt("aid");
                    user_info = new UserInfo(email,aid,name, lastname, birth,  city, state, uid);
                }
                cdb.close();
            }catch(Exception e){
                System.out.println(e);
            }
        }
        return user_info;
    }


    public static UserInfo getUserInfo(int aid){
        Connection cdb = DB.getConnection();
        UserInfo user_info = null;
        if(cdb != null){
            PreparedStatement ps = null;
            String sql="select uid,ufirst,ulast,ucity,ustate,uemail,ubirth\n" +
                    "from account natural join users\n" +
                    "where aid =?;";

            try{
                ps=cdb.prepareStatement(sql);
                ps.setInt(1,aid);
                ResultSet rs = ps.executeQuery();
                while(rs.next()){
                    String name= rs.getString("ufirst");
                    String lastname= rs.getString("ulast");
                    String city= rs.getString("ucity");
                    String state = rs.getString("ustate");
                    String email= rs.getString("uemail");
                    String birth = rs.getString("ubirth");
                    int uid = rs.getInt("uid");
                    user_info = new UserInfo(email,aid,name, lastname, birth,  city, state, uid);
                }
                cdb.close();
            }catch(Exception e){
                System.out.println(e);
            }
        }
        return user_info;
    }

    public static ArrayList<String> getPhoneNumbers(int uid){
        Connection cdb = DB.getConnection();
        ArrayList<String> phone_numbers = new ArrayList<String>();
        if(cdb != null){
            PreparedStatement ps = null;
            String sql="select phone from users natural join phone_numbers where uid=?";

            try {
                ps= cdb.prepareStatement(sql);
                ps.setInt(1, uid);
                ResultSet rs = ps.executeQuery();
                while (rs.next()) {
                    String phone = rs.getString("phone");
                    phone_numbers.add(phone);
                }
                cdb.close();
            }catch(Exception e){
                System.out.println(e);
            }
        }
        return phone_numbers;
    }

    public static ArrayList<String> getFeedback(int pid){
        Connection cdb = DB.getConnection();
        ArrayList<String> comments = new ArrayList<String>();
        if(cdb != null){
            PreparedStatement ps = null;
            String sql ="select comnt\n"+
                    "from product natural join feedback\n"+
                    "where pid=?";

            try{
                ps = cdb.prepareStatement(sql);
                ps.setInt(1,pid);
                ResultSet rs = ps.executeQuery();
                while(rs.next()){
                    String comment = rs.getString("comnt");
                    comments.add(comment);
                }
                cdb.close();
            }catch(Exception e){
                System.out.println(e);
            }
        }
        return comments;
    }

    public static CreditCard getCreditCard(int aid){
        Connection cdb = DB.getConnection();
        CreditCard credit_card = null;

        if(cdb != null){
            PreparedStatement ps = null;
            String sql = "select crid, ctype, cnumber, scode,expdate,bzip,bcity,country,bstate,baddress from credit_card\n"+
                          "where aid=?";

            try{
                ps = cdb.prepareStatement(sql);
                ps.setInt(1,aid);
                ResultSet rs = ps.executeQuery();
                while(rs.next()){
                    int crid = rs.getInt("crid");
                    String type = rs.getString("ctype");
                    String number = rs.getString("cnumber");
                    String scode = rs.getString("scode");
                    String expdate = rs.getString("expdate");
                    String bzip = rs.getString("bzip");
                    String bcity = rs.getString("bcity");
                    String country = rs.getString("country");
                    String bstate = rs.getString("bstate");
                    String baddress = rs.getString("baddress");
                    credit_card = new CreditCard(crid,number, expdate, scode, type, bzip, bcity, country, bstate, baddress);
                }
                cdb.close();
            }catch(Exception e){
                System.out.println(e);
            }
        }
        return credit_card;
    }

    public static Integer createUser(UserInfo info){
        Connection cdb = DB.getConnection();
        Integer uid = null;
        if(cdb != null){
            PreparedStatement ps= null;
            String sql="insert into users(ufirst,ulast,ubirth,uemail,ucity,ustate) values(?,?,?,?,?,?)" +
                    "returning uid;";

            try{
                ps = cdb.prepareStatement(sql);
                ps.setString(1,info.getFirstName());
                ps.setString(2,info.getLastName());
                ps.setString(3,info.getBirthDate());
                ps.setString(4,info.getEmail());
                ps.setString(5,info.getCity());
                ps.setString(6,info.getState());
                ResultSet rs = ps.executeQuery();
                while(rs.next()){
                   uid= rs.getInt("uid");
                }
                cdb.close();
            }catch(Exception e){
                System.out.println(e);
            }


        }
        return uid;

    }

    public static Integer createAccount(String uid){
        Connection cdb = DB.getConnection();
        Integer aid = null;
        int uid2 = Integer.parseInt(uid);
        if(cdb!= null){
            PreparedStatement ps = null;
            String sql="insert into account(uid,_type,sdate) values(?,'member','122016')" +
                    "returning aid;";

            try{
                ps= cdb.prepareStatement(sql);
                ps.setInt(1,uid2);
                ResultSet rs = ps.executeQuery();
                while(rs.next()){
                    aid=rs.getInt("aid");
                }
                cdb.close();
            }catch(Exception e){
                System.out.println(e);
            }


        }
        return aid;
    }

    public static void createLoginCred(Login cred){
        Connection cdb = DB.getConnection();

        if(cdb!= null){
            PreparedStatement ps =null;
            String sql = "insert into login_cred(aid,username,_password) values(?,?,?);";

            try{
                ps= cdb.prepareStatement(sql);
                ps.setInt(1,cred.getAID());
                ps.setString(2,cred.getUsername());
                ps.setString(3, cred.getPassword());
                ResultSet rs = ps.executeQuery();
                cdb.close();
            }catch(Exception e){
                System.out.println(e);
            }
        }

    }

    public static void createPhone(int uid, String phone){
        Connection cdb = DB.getConnection();

        if(cdb!= null){
            PreparedStatement ps = null;
            String sql ="insert into phone_numbers(uid,phone) values(?,?);";

            try{
                ps= cdb.prepareStatement(sql);
                ps.setInt(1,uid);
                ps.setString(2,phone);
                ResultSet rs = ps.executeQuery();
                cdb.close();
            }catch(Exception e){
                System.out.println(e);
            }
        }
    }

    public static void createCreditCard(CreditCard credit, int aid){
        Connection cdb= DB.getConnection();

        if(cdb!= null){
            PreparedStatement ps = null;
            String sql ="insert into credit_card(aid,cnumber,ctype,scode,expdate,bzip,bcity,country,bstate,baddress)" +
                    "values(?,?,?,?,?,?,?,?,?,?);";

            try{
                ps= cdb.prepareStatement(sql);
                ps.setInt(1,aid);
                ps.setString(2,credit.cardNumber);
                ps.setString(3,credit.type);
                ps.setString(4,credit.securityCode);
                ps.setString(5,credit.expDate);
                ps.setString(6,credit.bzip);
                ps.setString(7,credit.bcity);
                ps.setString(8,credit.country);
                ps.setString(9,credit.bstate);
                ps.setString(10,credit.baddress);
                ResultSet rs = ps.executeQuery();
                cdb.close();

            }catch(Exception e){
                System.out.println(e);
            }
        }
    }

    public static LoginManager getLoginStatus(String loginMessage, boolean status, int aid){
        LoginManager log = new LoginManager(aid, loginMessage, status);
        return log;
    }


}