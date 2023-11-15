package registration;

public class SignIn {

    private InstaPayDB obj;
    private User user;

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

    public void setUser(User user) {
        this.user = user;
    }

    public User getUser() {
        return user;
    }

    public void signIn(User u, Account account)
    {
        validateUser(u);
        loadUserProfile(user);
    }

    public boolean validateUser(User u)
    {
        for(int i=0;i<= obj.getSystemDB().size();i++)
        {
            user= obj.getSystemDB().get(i);
            if(user.getUserName().equals(u.getUserName()))
            {
                if(user.getPassword().equals(u.getPassword()))
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
            for(Account account : u.getAccounts())
            {
                account.printAccountDetails();
                System.out.println("******************************************");
            }
        }
    }
}