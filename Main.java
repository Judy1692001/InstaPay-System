import billsPayment.*;
import dataBase.*;
import registration.*;
import wallet.*;

import java.util.ArrayList;
import java.util.Scanner;


public class Main {


    public static void main(String[] args) {

        /*
        CIB Accounts
         */

//        Account c1 = new BankAccount("CIB","ali", "01098160035", 100100, 200);
//
//        Account c2 = new BankAccount("CIB", "mohamed", "01092358207", 111111, 300);
//
//        ArrayList<Account> cibAccounts=new ArrayList<>();
//
//        cibAccounts.add(c1);
//        cibAccounts.add(c2);
//
//        /*
//        CIB DataBase is now ready
//         */
//
//        DataBase cibDB = new CIBDataBase(cibAccounts);
//
//        /*
//        Banque Masr Accounts
//         */
//
//        Account b1 = new BankAccount("BanqueMasr", "ali", "01092678854", 199888, 200);
//
//        Account b2 = new BankAccount("BanqueMasr", "yara", "01092234451", 200200, 700);
//
//        ArrayList<Account> banqueMasrAccounts=new ArrayList<>();
//
//        banqueMasrAccounts.add(b1);
//        banqueMasrAccounts.add(b1);
//
//        /*
//        BanqueMasr DataBase is now ready
//         */
//
//
//        DataBase banqueMasrDB = new BanqueMasrDataBase(banqueMasrAccounts);
//
//        /*
//        Vodafone Accounts
//         */
//
//        Account v1 = new WalletAccount("Vodafone Cash", "judy", "01098160035", 100100, 900);
//
//        Account v2 = new WalletAccount("Vodafone Cash", "salma", "01092225678", 299899, 300);
//
//        ArrayList<Account> vodafoneCashAccounts=new ArrayList<>();
//
//        vodafoneCashAccounts.add(v1);
//        vodafoneCashAccounts.add(v2);
//
//        /*
//        Vodafone DataBase is now ready
//         */
//
//        DataBase vodafoneDB = new VodafoneDataBase(vodafoneCashAccounts);
//
//        /*
//        Orange Accounts
//         */
//
//        Account o1 = new WalletAccount("Orange Cash", "salma", "01095678876", 200300, 600);
//
//        Account o2 = new WalletAccount("Orange Cash", "menna", "01095564378", 900900, 800);
//
//        ArrayList<Account> orangeCashAccounts=new ArrayList<>();
//
//        orangeCashAccounts.add(o1);
//        orangeCashAccounts.add(o2);
//
//        /*
//        Orange DataBase is now ready
//         */
//
//        DataBase orangeDB = new OrangeDataBase(orangeCashAccounts);
//
//        /*
//        Provide each Bank / Company with it's suitable database
//         */
//
//        Bank cib = new CIB(cibDB);
//
//        Bank banqueMasr = new BanqueMasr(banqueMasrDB);
//
//        TeleCommunicationCompany vodafone = new Vodafone(vodafoneDB);
//
//        TeleCommunicationCompany orange = new Orange(orangeDB);
//
//        ElectronicPaymentCompany fawry = new Fawry(vodafoneDB);




        ArrayList<Account> basicAcc=new ArrayList<>();
        basicAcc.add(new BankAccount("Ahmed Ali","01234","typeee",453,1000));

        ArrayList<Bill> b=new ArrayList<>();
        b.add(new GasBill( 123.55, 1111, 1000,"pepsi adv"));

        ArrayList<User> intializeDB= new ArrayList<>();
        intializeDB.add(new User("Ahmed Ali","01234","ahmed123","12##",basicAcc,b));

        InstaPayDB data=new InstaPayDB(intializeDB);

        System.out.println("to create new account enter 1, to sign in enter 2");
        Scanner scanner = new Scanner(System.in);
        int userInput = scanner.nextInt();

        if(userInput==1)
        {
            System.out.println("to create Bank account enter 1, to create wallet account enter 2");
            userInput = scanner.nextInt();

            if(userInput==1)
            {
                SignUp newUser=new BankAccountSignUp(data);
//                newUser.register(null);
            }

            else if(userInput==2){
                SignUp newUser=new WalletAccountSignUp(data);
//                newUser.register(null);
            }

        }

        else if(userInput==2){
              System.out.print("enter your username: ");
              String um = scanner.next();
            System.out.print("enter your password: ");
            String pw = scanner.next();

//            System.out.println(um);
//            System.out.println(pw);

            User X=new User("","",um,pw,new ArrayList<>(),new ArrayList<>());
            SignIn ss=new SignIn(data);
                   ss.signIn(X);

                   System.out.println("Available services: press (1) for pay bills, (2) for transfer money ");
                    int choice = scanner.nextInt();

                    if(choice==1){
                          System.out.println("Your bills are: ");
                          for(int i=0;i<ss.getUser().getBills().size();i++){
                              ss.getUser().getBills().get(i).displayContent();

                              System.out.println("choose bill to pay: ");
                              int choiceBill = scanner.nextInt();

                              System.out.println("press 1 to pay by bank account or 2 to pay by wallet");
                              int choicemethod = scanner.nextInt();

                              if(choicemethod==1){
                                  Payment p=new BankPayment();
                                  p.payBills(ss.getUser(),  ss.getUser().getBills().get(choiceBill-1));
                              }

                              else if(choicemethod==2){
                                  Payment p=new WalletPayment();
                                  p.payBills(ss.getUser(),  ss.getUser().getBills().get(choiceBill-1));

                              }

                          }
                    }

        }

//        Payment p=new BankPayment();
//        p.payBills(new User("Ahmed Ali","01234","ahmed123","12##",basicAcc,b),b.get(0));

    }
}