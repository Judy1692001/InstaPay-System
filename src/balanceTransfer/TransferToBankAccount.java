package balanceTransfer;

import balanceTransfer.Transference;
import registration.Account;
import registration.BankAccount;

public class TransferToBankAccount implements Transference {
//    @Override
    public void transferMoney(Account a1, Account a2, double Amount) {
        if(a1.getClass() == BankAccount.class && a2.getClass() == BankAccount.class){
            if(a1.getBalance()-Amount >= 0 ){
                a1.setBalance(a1.getBalance()-Amount);
                a2.setBalance(a2.getBalance()+Amount);
                System.out.println("Transferring done Successfully.");
            }
            else System.out.println("Your Balance isn't enough!");
        }
        else if (a1.getClass() == BankAccount.class){
            System.out.println("the Account you're trying to Transfer to is not a Bank Account!");
        }
        else if (a2.getClass() == BankAccount.class){
            System.out.println("your Account is not a Bank Account!");
        }
        else
            System.out.println("Both Accounts are not a Bank Accounts!");
    }
}
