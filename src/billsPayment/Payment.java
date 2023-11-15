package billsPayment;

import billsPayment.Bill;
import registration.User;

public interface Payment {

    public void payBills(User u, Bill b);
}