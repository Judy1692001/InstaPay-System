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

    public void sendOTP(int mobileNumber)
    {
        System.out.println("An OTP: " + getCode() + " has been sent to " + mobileNumber);
    }

    public boolean checkOTP()
    {
        System.out.println("Validate OTP To Continue");
        Scanner obj = new Scanner(System.in);
        String response = obj.nextLine();

        return (response == "validate");
    }
}
