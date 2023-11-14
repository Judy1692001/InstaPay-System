package registration;

import billsPayment.Bill;

import java.util.ArrayList;

public class User {

    private String name;
    private String mobileNumber;
    private String userName;  // how can he have a username and password before signing up??
    private String password;
    private ArrayList <Account> accounts;
//    private ArrayList <Bill> bills;  // he might not have bills to pay already

    public User(String name, String mobileNumber, String userName, String password, ArrayList <Account> accounts /*ArrayList <Bill> bills*/)
    {
        this.name = name;
        this.mobileNumber = mobileNumber;
        this.userName = userName;
        this.password = password;
        this.accounts = accounts;
//        this.bills = bills;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public String getName()
    {
        return name;
    }

    public void setMobileNumber(String mobileNumber)
    {
        this.mobileNumber = mobileNumber;
    }

    public String getMobileNumber()
    {
        return mobileNumber;
    }

    public void setUserName(String userName)
    {
        this.userName = userName;
    }

    public String getUserName()
    {
        return userName;
    }

    public void setPassword(String password)
    {
        this.password = password;
    }

    public String getPassword() {
        return password;
    }

    public void setAccounts(ArrayList <Account> accounts)
    {
        this.accounts = accounts;
    }

    public ArrayList <Account> getAccounts()
    {
        return accounts;
    }

    /*public void setBills(ArrayList <Bill> bills)
    {
        this.bills = bills;
    }

    public ArrayList <Bill> getBills()
    {
        return bills;
    }*/

    // public void requestService();
}
