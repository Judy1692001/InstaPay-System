package registration;

public class WalletAccount extends Account{
    public WalletAccount(String holderName, int holderMobileNumber, String type, int PIN, double balance) {
        super(holderName, holderMobileNumber, type, PIN, balance);
    }
}
