package registration;

import dataBase.CIBDataBase;
import dataBase.DataBase;

import java.util.Scanner;

public abstract class SignUp {

    private InstaPayDB systemDB;
    private DataBase companyDB;

    public SignUp(InstaPayDB systemDB, DataBase companyDB)
    {
        this.systemDB = systemDB;
        this.companyDB = companyDB;
    }

    public void setSystemDB(InstaPayDB systemDB)
    {
        this.systemDB = systemDB;
    }

    public InstaPayDB getSystemDB()
    {
        return systemDB;
    }

    public void setCompanyDB(DataBase companyDB)
    {
        this.companyDB = companyDB;
    }

    public DataBase getCompanyDB()
    {
        return companyDB;
    }

    public final void register(User u, Account account)
    {
        authenticateUser (account);

        if(authenticateUser(account))
        {
            sendAndVerifyOTP (u);
            enterUsername (u);
            enterPassword (u);
        }
        else
            System.out.println("Please try again");
    }

    public abstract boolean authenticateUser (Account account);

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
    }

    public void enterUsername (User u)
    {
        System.out.println("Username: ");
        Scanner o = new Scanner((System.in));
        String userName = o.nextLine();

            for(User user : systemDB.getSystemDB())
            {
                if(user.getUserName() == userName)
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

        System.out.println(("You are now an InstaPay member"));

        systemDB.addUser(u);
    }
}
