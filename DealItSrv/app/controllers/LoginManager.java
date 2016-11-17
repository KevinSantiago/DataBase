package controllers;

/**
 * Created by Kevin Santiago Ortiz
 */
public class LoginManager{

    private int aid;
    private String exeLog;
    private boolean isValid;

    public LoginManager (int aid, String exeLog, boolean isValid) {
        this.aid = aid;
        this.exeLog = exeLog;
        this.isValid = isValid;
    }

    public int getAID() {
        return aid;
    }

    public String getExeLog() {
        return exeLog;
    }

    public boolean isValid() {
        return isValid;
    }
}
