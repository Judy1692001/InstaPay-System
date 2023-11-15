package balanceInquiry;

import balanceInquiry.Inquiry;
import registration.Account;
import registration.BankAccount;
import registration.User;

public class BankAccountInquiry implements Inquiry {
    @Override
    public void inquireAboutBalance(Account a) {
        System.out.println("Your current " + a.getProviderName() + " balance is : " + ((BankAccount) a).getBalance() );
    }
}
