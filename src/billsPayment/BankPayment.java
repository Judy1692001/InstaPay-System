package billsPayment;

import billsPayment.Bill;
import billsPayment.Payment;
import registration.BankAccount;
import registration.User;
import registration.WalletAccount;

public class BankPayment implements Payment {
    @Override
    public void payBills(User u, Bill b) {

        for(int i=0;i<u.getAccounts().size();i++){
            if(u.getAccounts().get(i)instanceof BankAccount && u.getAccounts().get(i).getBalance() >= b.getCost()){
                double newb= u.getAccounts().get(i).getBalance() - b.getCost();
                u.getAccounts().get(i).setBalance(newb);
                System.out.println("Your bill is paid successfully from account with PIN "+ u.getAccounts().get(i).getPIN()+" and remaining "+u.getAccounts().get(i).getBalance()+" pounds");
                return;
            }
        }

        System.out.println("there is no enought money to pay this bill");
    }
}