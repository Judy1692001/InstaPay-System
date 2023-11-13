package registration;

public class Account {

    //should put bank name
    private String holderName;
    private int holderMobileNumber;
    private String type;
    private int PIN;
    private double balance;
    //private Transaction [] transactionHistory;

    //private Service [] linkedServices;

    public Account(String holderName, int holderMobileNumber, String type, int PIN, double balance)
    {
        this.holderName = holderName;
        this.holderMobileNumber = holderMobileNumber;
        this.type = type;
        this.PIN = PIN;
        this.balance = balance;
    }

    public void setHolderName(String holderName)
    {
        this.holderName = holderName;
    }

    public String getHolderName()
    {
        return holderName;
    }

    public void setHolderMobileNumber(int holderMobileNumber)
    {
        this.holderMobileNumber = holderMobileNumber;
    }

    public int getHolderMobileNumber()
    {
        return holderMobileNumber;
    }

    public void setType(String type)
    {
        this.type = type;
    }

    public String getType()
    {
        return type;
    }

    public void setPIN(int PIN)
    {
        this.PIN = PIN;
    }

    public int getPIN()
    {
        return PIN;
    }

    public void setBalance(double balance)
    {
        this.balance = balance;
    }

    public double getBalance()
    {
        return balance;
    }

    /*public void setTransactionHistory(Transaction [] transactionHistory)
    {
        this.transactionHistory = transactionHistory;
    }

    public Transaction [] getTransactionHistory()
    {
        return transactionHistory;
    }

    public void setLinkedServices(Service [] linkedServices)
    {
        this.linkedServices = linkedServices;
    }

    public Service [] getLinkedServices()
    {
        return linkedServices;
    }*/
}
