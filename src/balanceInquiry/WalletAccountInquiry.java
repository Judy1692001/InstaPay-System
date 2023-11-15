package balanceInquiry;

import registration.Account;
import registration.BankAccount;
import registration.WalletAccount;

public class WalletAccountInquiry implements Inquiry{
    @Override
    public void inquireAboutBalance(Account a) {
        System.out.println("Your current " + a.getProviderName() + " balance is : " + ((WalletAccount) a).getBalance() );
    }
}
