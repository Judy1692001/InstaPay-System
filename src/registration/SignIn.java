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

    public void SignIn(User u)
    {
        authenticateUser(u);
        loadUserProfile(u);
    }

    public boolean authenticateUser(User u)
    {
        for(int i=0;i<obj.getSystemDB().length;i++)
        {
            if(obj.getSystemDB()[i].getUserName() == u.getUserName())
            {
                if(obj.getSystemDB()[i].getPassword() == u.getPassword())
                    return true;
            }
        }

        System.out.println("You aren't registered yet, want to Sign Up?");

        return false;
    }

    public void loadUserProfile(User u)
    {
        if(authenticateUser(u))
        {
            System.out.println("Welcome back " + u.getUserName());
            System.out.println("Mobile Number: " + u.getMobileNumber());
            System.out.println(u.getUserName() + "'s current accounts:");

            for(int i=0;i<u.getAccounts().length;i++)
            {
                System.out.println(u.getAccounts()[i].getType() + " : " + u.getAccounts()[i].getBalance()
                + " EGP");
            }
        }
    }
}
