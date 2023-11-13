package registration;

import java.util.Scanner;

public abstract class SignUp {

    private InstaPayDB obj;

    public SignUp(InstaPayDB obj)
    {
        this.obj = obj;
    }

    public void setSystemDB(InstaPayDB obj)
    {
        this.obj = obj;
    }

    public InstaPayDB getSystemDB()
    {
        return obj;
    }

    public final void register(User u)
    {
        authenticateUser (u);  //search database of bank or wallet
        sendAndVerifyOTP (u);
        enterUsername (u);
        enterPassword (u);
        // don't forget to add user to system db after successful registration
    }

    public abstract void authenticateUser (User u);

    public void sendAndVerifyOTP (User u)
    {
        OTP otp = new OTP("v6h23"); // learn how to generate random code
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

        for(int i=0;i<obj.getSystemDB().length;i++)
        {
            if(obj.getSystemDB()[0].getUserName() == userName)
            {
                System.out.println("This username is taken, try something else");

                enterUsername(u);
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
    }
}
