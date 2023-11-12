package signupprocess;

public abstract class SignUp {

    private InstaPayDB systemDB;

    public void register(User u, String username, String password)
    {
        abstract boolean authenticateUser (User u);  //search database of bank or wallet
        boolean sendAndVerifyOTP (User u);
        boolean enterUsername (username);
        boolean enterPassword (password);
    }

    public boolean sendAndVerifyOTP (User u)
    {
        //if user entered the mobile number connected to either bank account or waller
        // then approve
        // else decline
    }

    public boolean enterUsername (username)
    {

    }

    public boolean enterPassword (password)
    {

    }
}
