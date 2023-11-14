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
        System.out.println("Enter OTP you received to continue SignUp process");

        Scanner obj = new Scanner(System.in);
        String response = obj.nextLine();

        if(response.equals(getCode()))
            return true;
        else
            return false;
    }
}
