package registration;

public class WalletAccount extends Account{
    private int loyaltyPoints;

// token
    // loyalty points
    public WalletAccount(String ID, String providerName, String holderName, String holderMobileNumber, int PIN, double balance, int loyaltyPoints) {
        super(ID, providerName, holderName, holderMobileNumber, PIN, balance);
    }

    public void setLoyaltyPoints(int loyaltyPoints)
    {
        this.loyaltyPoints = loyaltyPoints;
    }

    public int getLoyaltyPoints()
    {
        return loyaltyPoints;
    }

    @Override
    public void printAccountDetails() {
        System.out.println("ID: " + getID());
        System.out.println("Provider's Name: " + getProviderName());
        System.out.println("Name: " + getHolderName());
        System.out.println("Mobile Number: " + getHolderMobileNumber());
        System.out.println("PIN: " + getPIN());
        System.out.println("Balance: " + getBalance());
        System.out.println("Loyalty Points: " + getLoyaltyPoints());
    }
}
