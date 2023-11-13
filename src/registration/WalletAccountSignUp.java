package registration;

public class WalletAccountSignUp extends SignUp{
    public WalletAccountSignUp(InstaPayDB obj) {
        super(obj);
    }

    @Override
    public void authenticateUser(User u) {
        /* mobile number should be verified first with the wallet
        provider
         */
    }
}
