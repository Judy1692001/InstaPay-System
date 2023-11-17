package registration;

public class BankAccount extends Account{

    private String bankService;

    public BankAccount(String ID, String providerName, String holderName, String holderMobileNumber, int PIN, double balance,
                       String bankService) {
        super(ID, providerName, holderName, holderMobileNumber, PIN, balance);
        this.bankService = bankService;
    }

    public void setBankService(String bankService)
    {
        this.bankService = bankService;
    }

    public String getBankService()
    {
        return bankService;
    }

    @Override
    public void printAccountDetails() {
        System.out.println("Loading your profile now..");
        System.out.println("ID: " + getID());
        System.out.println("Provider's Name: " + getProviderName());
        System.out.println("Name: " + getHolderName());
        System.out.println("Mobile Number: " + getHolderMobileNumber());
        System.out.println("PIN: " + getPIN());
        System.out.println("Balance: " + getBalance());
        System.out.println("Bank's Service: " + getBankService());
    }
}
