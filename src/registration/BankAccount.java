package registration;

public class BankAccount extends Account{

    public BankAccount(String providerName, String holderName, String holderMobileNumber, int PIN, double balance) {
        super(providerName, holderName, holderMobileNumber, PIN, balance);

        //add bank attribute
    }
}
