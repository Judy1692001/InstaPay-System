package registration;

public class BankAccountSignUp extends SignUp{
    public BankAccountSignUp(InstaPayDB obj) {
        super(obj);
    }

    @Override
    public void authenticateUser(User u) {
        // will choose one of the accounts in account lists of user
        // then will connect with bank api to check if this account exists in
        // this bank's db or not
    }
}
