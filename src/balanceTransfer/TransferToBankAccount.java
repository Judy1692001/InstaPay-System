package balanceTransfer;

import balanceTransfer.Transference;
import registration.*;

public class TransferToBankAccount implements Transference {

    private InstaPayDB obj;

    public TransferToBankAccount(InstaPayDB obj)
    {
        this.obj = obj;
    }

    public void setObj(InstaPayDB obj)
    {
        this.obj = obj;
    }

    public InstaPayDB getObj()
    {
        return obj;
    }
    @Override
    public void transferMoney(Account a1, Account a2, double Amount) {
        // user need to sign up first with a bank account, then he can perform it
       for(User user : getObj().getSystemDB())
       {
           if (user.getMobileNumber().equals(a1.getHolderMobileNumber()))
           {
               //user has previously registered with this mobile number
               if (a1.getClass() == BankAccount.class && a2.getClass() == BankAccount.class)
               {
                   if (((BankAccount) a1).getBalance() >= Amount)
                   {
                       ((BankAccount) a1).setBalance(((BankAccount) a1).getBalance() - Amount);
                       ((BankAccount) a2).setBalance(((BankAccount) a2).getBalance() + Amount);

                       System.out.println("Transference done Successfully.");
                   }
                   else
                       System.out.println("Your Balance isn't enough!");
               }
           }

           break;
       }

        System.out.println("You need to register with your bank account first!");
    }
}
