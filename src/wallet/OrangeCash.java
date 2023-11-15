package wallet;

import balanceTransfer.*;
import balanceInquiry.*;
import billsPayment.*;

public class OrangeCash extends DigitalWallet{
    @Override
    public void Service() {
        System.out.println("You now have an Orange wallet");
    }
}
