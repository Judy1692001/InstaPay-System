package balanceTransfer;

import balanceTransfer.Transference;
import registration.*;

public class TransferToInstaPayAccount implements Transference {

    private InstaPayDB obj;

    public TransferToInstaPayAccount(InstaPayDB obj)
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
    // transfer to instapay account from an instapay account
    @Override
    public void transferMoney(Account a1, Account a2, double Amount) {

        for (User user1 : getObj().getSystemDB())
        {
            if(user1.getMobileNumber().equals(a1.getHolderMobileNumber()))
            {
                if(a1.getID().startsWith("B"))
                {
                    //an instapay user who registered with his bank account
                    for(User user2 : getObj().getSystemDB())
                    {
                        if(user2.getMobileNumber().equals(a2.getHolderMobileNumber()))
                        {
                            // they are both instapay users
                            if(a2.getID().startsWith("W"))
                            {
                                //an instapay user who registered with his mobile number
                                if(((BankAccount) a1).getBalance() >= Amount)
                                {
                                    ((BankAccount) a1).setBalance(((BankAccount) a1).getBalance() - Amount);
                                    ((WalletAccount) a2).setBalance(((WalletAccount) a2).getBalance() + Amount);

                                    System.out.println("Transference done Successfully.");

                                    break;
                                }
                                else
                                {
                                    System.out.println("Your Balance isn't enough!");

                                    break;
                                }
                            }
                            else if(a2.getID().startsWith("B"))
                            {
                                //an instapay user who registered with his bank account
                                if(((BankAccount) a1).getBalance() >= Amount)
                                {
                                    ((BankAccount) a1).setBalance(((BankAccount) a1).getBalance() - Amount);
                                    ((BankAccount) a2).setBalance(((BankAccount) a2).getBalance() + Amount);

                                    System.out.println("Transference done Successfully.");

                                    break;
                                }
                                else
                                {
                                    System.out.println("Your Balance isn't enough!");

                                    break;
                                }
                            }
                        }
                    }

                    System.out.println("The user you are trying to transfer money to isn't an instapay user");
                }
                else if(a1.getID().startsWith("W"))
                {
                    //an instapay user who registered with his wallet account
                    for(User user2 : getObj().getSystemDB())
                    {
                        if(user2.getMobileNumber().equals(a2.getHolderMobileNumber()))
                        {
                            if(a2.getID().startsWith("B"))
                            {
                                //an instapay user who registered with his bank account
                                if(a1.getBalance() >= Amount)
                                {
                                    ((WalletAccount) a1).setBalance(((WalletAccount) a1).getBalance() - Amount);
                                    ((BankAccount) a2).setBalance(((BankAccount) a2).getBalance() + Amount);

                                    System.out.println("Transference done Successfully.");

                                    break;
                                }
                                else
                                {
                                    System.out.println("Your Balance isn't enough!");

                                    break;
                                }
                            }
                            else if(a2.getID().startsWith("W"))
                            {
                                //an instapay user who registered with his wallet account
                                if(a1.getBalance() >= Amount)
                                {
                                    ((WalletAccount) a1).setBalance(((WalletAccount) a1).getBalance() - Amount);
                                    ((WalletAccount) a2).setBalance(((WalletAccount) a2).getBalance() + Amount);

                                    System.out.println("Transference done Successfully.");

                                    break;
                                }
                                else
                                {
                                    System.out.println("Your Balance isn't enough!");

                                    break;
                                }
                            }
                        }
                    }
                }
            }

            break;
        }
    }
}
