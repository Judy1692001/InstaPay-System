package dataBase;

import registration.Account;

import java.util.ArrayList;

public abstract class DataBase {

    private ArrayList <Account> db;

    public DataBase(ArrayList <Account> db)
    {
        this.db = db;
    }

    public void setDB(ArrayList <Account> db)
    {
        this.db = db;
    }

    public ArrayList <Account> getDB()
    {
        return db;
    }

    public boolean matchMobileNumber(String holderMobileNumber)
    {
        for(Account a : getDB())
        {
            if(a.getHolderMobileNumber().equals(holderMobileNumber))
                return true;
        }

        return false;
    }
}
