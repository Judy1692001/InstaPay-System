package wallet;

import balanceInquiry.Inquiry;
import balanceTransfer.Transference;
import billsPayment.Payment;

public class CIBWallet extends DigitalWallet{

    @Override
    public void Service() {

        System.out.println("You now have a CIB wallet");
    }
}
