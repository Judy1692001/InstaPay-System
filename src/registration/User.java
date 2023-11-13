package registration;

public class User {

    private String name;
    private int mobileNumber;
    private String userName;
    private String password;
    private Account [] accounts;
    //private Bill [] bills;

    public User(String name, int mobileNumber, String userName, String password, Account [] accounts)
    {
        this.name = name;
        this.mobileNumber = mobileNumber;
        this.userName = userName;
        this.password = password;
        this.accounts = accounts;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public String getName()
    {
        return name;
    }

    public void setMobileNumber(int mobileNumber)
    {
        this.mobileNumber = mobileNumber;
    }

    public int getMobileNumber()
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

    public String getPassword()
    {
        return password;
    }

    public void setAccounts(Account [] accounts)
    {
        this.accounts = accounts;
    }

    public Account [] getAccounts()
    {
        return accounts;
    }

    /*public void setBills(Bill [] bills)
    {
        this.bills = bills;
    }

    public Bill [] getBills()
    {
        return bills;
    }*/

    //abstract void requestService(Service s);
}
