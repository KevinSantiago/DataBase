package controllers;

/**
 * Created by Jose A Rodriguez Rivera on 10/11/16.
 */
public class Login {
    private String username;
    private String password;
    private int aid;

    public Login(){}

    public Login(String username, String password, int aid) {
        this.username = username;
        this.password = password;
        this.aid=aid;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public boolean passwordMatch(String pwd){
        return pwd.equals(password);
    }
}
