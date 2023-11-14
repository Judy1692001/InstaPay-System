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

    public void signIn(User u)
    {
        validateUser(u);
        loadUserProfile(u);
    }

    public boolean validateUser(User u)
    {
        for(User user : obj.getSystemDB())
        {
            if(user.getUserName() == u.getUserName())
            {
                if(user.getPassword() == u.getPassword())
                {
                    return true;
                }
            }
        }

        System.out.println("You aren't registered yet, want to Sign Up?");

        return false;
    }

    public void loadUserProfile(User u)
    {
        if(validateUser(u))
        {
            System.out.println("Welcome back " + u.getUserName());
            System.out.println("Mobile Number: " + u.getMobileNumber());
            System.out.println(u.getUserName() + "'s current accounts:");

            for(Account account : u.getAccounts())
            {
                System.out.println(account.getProviderName() + account.getBalance() + " EGP");
            }
        }
    }
}
