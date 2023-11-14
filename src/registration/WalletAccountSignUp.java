package registration;

public class WalletAccountSignUp extends SignUp{
    public WalletAccountSignUp(InstaPayDB obj) {
        super(obj);
    }

    @Override
    public void authenticateUser(User u, Account account) {
        /* mobile number should be verified first with the wallet
        provider
         */
        if(account.getProviderName() == "Vodafone")
        {

        }
        else if(account.getProviderName() == "Orange")
        {

        }
        else if(account.getProviderName() == "Fawry")
        {

        }
        else if(account.getProviderName() == "CIB")
        {

        }
        else if(account.getProviderName() == "BanqueMasr");
        {

        }

    }
}
