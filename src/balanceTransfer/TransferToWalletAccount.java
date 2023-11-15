package balanceTransfer;

import balanceTransfer.Transference;
import registration.Account;
import registration.BankAccount;
import registration.WalletAccount;

public class TransferToWalletAccount implements Transference {
    @Override
    public void transferMoney(Account a1, Account a2, double Amount) {

        if(a1.getID().startsWith("W"))
        {
            //transferring from wallet account to a wallet account
            if(a1.getBalance() >= Amount)
            {
                ((WalletAccount) a1).setBalance(((WalletAccount) a1).getBalance() - Amount);
                ((WalletAccount) a2).setBalance(((WalletAccount) a2).getBalance() + Amount);

                System.out.println("Transference done Successfully.");
            }
            else
                System.out.println("Your Balance isn't enough!");
        }
        else if(a1.getID().startsWith("B"))
        {
            //transferring from bank account to a wallet account
            if(a1.getBalance() >= Amount)
            {
                ((BankAccount) a1).setBalance(((BankAccount) a1).getBalance() - Amount);
                ((WalletAccount) a2).setBalance(((WalletAccount) a2).getBalance() + Amount);

                System.out.println("Transference done Successfully.");
            }
            else
                System.out.println("Your Balance isn't enough!");
        }
    }
}
