package registration;

public class Account {

    private String providerName;
    private String holderName;
    private String holderMobileNumber;
    private int PIN;
    private double balance;

    public Account(String providerName, String holderName, String holderMobileNumber, int PIN, double balance)
    {
        this.providerName = providerName;
        this.holderName = holderName;
        this.holderMobileNumber = holderMobileNumber;
        this.PIN = PIN;
        this.balance = balance;
    }

    public void setProviderName(String providerName)
    {
        this.providerName = providerName;
    }

    public String getProviderName()
    {
        return providerName;
    }

    public void setHolderName(String holderName)
    {
        this.holderName = holderName;
    }

    public String getHolderName()
    {
        return holderName;
    }

    public void setHolderMobileNumber(String holderMobileNumber)
    {
        this.holderMobileNumber = holderMobileNumber;
    }

    public String getHolderMobileNumber()
    {
        return holderMobileNumber;
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
}
