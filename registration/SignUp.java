package registration;

import java.util.Scanner;

public abstract class SignUp {

    private InstaPayDB systemDataBase;

    public SignUp(InstaPayDB systemDataBase)
    {
        this.systemDataBase = systemDataBase;
    }

    public void setSystemDB(InstaPayDB systemDataBase)
    {
        this.systemDataBase = systemDataBase;
    }

    public InstaPayDB getSystemDB()
    {
        return systemDataBase;
    }

    public final void register(User u, Account account)
    {
//        authenticateUser (u);  //search database of bank or wallet
        sendAndVerifyOTP (u);
        enterUsername (u);
        enterPassword (u);
    }

    public abstract void authenticateUser (User u, Account account);

    public void sendAndVerifyOTP (User u)
    {
        int randomNum = (int)(Math.random() * 900000) ;

        String code = Integer.toString(randomNum);

        OTP otp = new OTP(code);

        otp.sendOTP(u.getMobileNumber());

        if(otp.checkOTP())
            System.out.println("OTP verified");
        else
            sendAndVerifyOTP(u);
        //if user entered the mobile number connected to either bank account or wallet
        // then approve
        // else decline
    }

    public void enterUsername (User u)
    {
        System.out.println("Username: ");
        Scanner o = new Scanner((System.in));  // "ali" "ahmed" "yara"
        String userName = o.nextLine();

        for(int i=0;i<systemDataBase.getSystemDB().size();i++)
        {
            for(User user : systemDataBase.getSystemDB())
            {
                if(user.getUserName() == userName)
                {
                    System.out.println("This username is taken, try something else");

                    enterUsername(u);
                }
            }
        }

        u.setUserName(userName);

        System.out.println("Username set Successfully");
    }

    public void enterPassword (User u)
    {
        System.out.println("Password: ");
        Scanner o = new Scanner((System.in));
        String password = o.nextLine();

        u.setPassword(password);

        System.out.println("Password set Successfully");

        systemDataBase.addUser(u);
    }
}
