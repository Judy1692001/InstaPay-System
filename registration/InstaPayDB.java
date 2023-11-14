package registration;

import java.util.ArrayList;

public class InstaPayDB {

    private ArrayList <User> systemDB = new ArrayList<>();

    public InstaPayDB(ArrayList <User> systemDB)
    {
        this.systemDB = systemDB;
    }

    public void setSystemDB(ArrayList <User> systemDB)
    {
        this.systemDB = systemDB;
    }

    public ArrayList <User> getSystemDB()
    {
        return systemDB;
    }

    public void addUser(User u)
    {
        systemDB.add(u);
    }
}
