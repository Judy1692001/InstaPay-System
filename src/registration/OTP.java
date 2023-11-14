package registration;

import java.util.Scanner;

public class OTP {

    private String code;

    public OTP(String code)
    {
        this.code = code;
    }

    public void setCode(String code)
    {
        this.code = code;
    }

    public String getCode()
    {
        return code;
    }

    public void sendOTP(String mobileNumber)
    {
        System.out.println("An OTP: " + getCode() + " has been sent to " + mobileNumber);
    }

    public boolean checkOTP()
    {
        System.out.println("Choose (Validate OTP) to continue SignUp process");

        Scanner obj = new Scanner(System.in);
        String response = obj.nextLine();

        if(response == "Validate OTP")
            return true;

        return false;
    }
}
