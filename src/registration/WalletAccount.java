package registration;

public class WalletAccount extends Account{

    public WalletAccount(String providerName, String holderName, String holderMobileNumber, int PIN, double balance) {
        super(providerName, holderName, holderMobileNumber, PIN, balance);

        //add wallet attribute
    }
}
