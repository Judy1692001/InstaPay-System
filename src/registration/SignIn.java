package registration;

public class SignIn {

    private InstaPayDB obj;

    public SignIn(InstaPayDB obj)
    {
        this.obj = obj;
    }

    public void setInstaPayDB(InstaPayDB obj)
    {
        this.obj = obj;
    }

    public InstaPayDB getInstaPayDB()
    {
        return obj;
    }

    public void signIn(User u, Account account)
    {
        validateUser(u);
        loadUserProfile(u, account);
    }

    public boolean validateUser(User u)
    {
        for(User user : obj.getSystemDB())
        {
            if(user.getUserName() == u.getUserName())
            {
                if(user.getPassword() == u.getPassword())
                {
                    System.out.println("Welcome Back " + u.getUserName());
                    return true;
                }
            }
        }

        System.out.println("You aren't registered yet, want to Sign Up?");

        return false;
    }

    public void loadUserProfile(User u, Account account)
    {
        if(validateUser(u))
        {
            for(Account a : u.getAccounts())
            {
                a.printAccountDetails();
            }
        }
    }
}
