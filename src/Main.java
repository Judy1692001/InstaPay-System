import balanceInquiry.BankAccountInquiry;
import balanceInquiry.Inquiry;
import balanceTransfer.TransferToBankAccount;
import balanceTransfer.Transference;
import dataBase.*;
import registration.*;
import wallet.*;
import billsPayment.*;

import java.util.ArrayList;
import java.util.Scanner;


public class Main {


    public static void main(String[] args) {
       /* //testing registration package

        //important!! fill in system database
        *//*User u1 = new User("ali", "01098160035", myAccounts);
        User u2 = new User("amr", "01098160033", myAccounts);
        User u3 = new User("hoda", "01098160065", myAccounts);
        User u4 = new User("yara", "01098169035", myAccounts);
        User u5 = new User("rana", "01098360035", myAccounts);*//*
        // ---------------------------------------------------------------------------------

        // CIB DataBase
        // Supports Both Accounts!!

        ArrayList <Account> cibDataBase = new ArrayList<>(2);  // cib bank has 2 clients initially

        Account cibClient1 = new BankAccount("B1", "CIB", "judy", "01098160035", 109100, 900, "Checking");
        Account cibClient2 = new WalletAccount("W1", "CIB", "aya", "01096160035", 202200, 900, 80);

        cibDataBase.add(cibClient1);
        cibDataBase.add(cibClient2);

        DataBase d1 = new CIBDataBase(cibDataBase);

        // ---------------------------------------------------------------------------------

        // BanqueMasr DataBase
        // Supports Both Accounts!!

        ArrayList <Account> banqueMasrDataBase = new ArrayList<>(2);  // banquemasr bank has 2 clients initially

        Account banqueMasrClient1 = new BankAccount("B1", "BanqueMasr", "zeina", "01088160035", 109180, 900, "Savings");
        Account banqueMasrClient2 = new WalletAccount("W1", "BanqueMasr", "rana", "01096160035", 282200, 400, 90);

        banqueMasrDataBase.add(banqueMasrClient1);
        banqueMasrDataBase.add(banqueMasrClient2);

        DataBase d2 = new BanqueMasrDataBase(banqueMasrDataBase);

        // ---------------------------------------------------------------------------------

        // Fawry DataBase
        // Supports Both Accounts!!
        // does it support both types?

        ArrayList <Account> fawryDataBase = new ArrayList<>(2);  // fawry has 2 clients initially

        Account fawryClient1 = new BankAccount("B1", "Fawry", "malak", "01078140035", 109170, 800, "Checking");
//        Account fawryClient2 = new WalletAccount("W1", "Fawry", "mohamed", "01096060035", 208200, 1600, 96);

        fawryDataBase.add(fawryClient1);
//        fawryDataBase.add(fawryClient2);

//        DataBase d3 = new VodafoneDataBase(fawryDataBase);  // how to make it accept wallet accounts?

        // ---------------------------------------------------------------------------------

        // Vodafone DataBase
        // Supports Only Wallet Accounts!!

        ArrayList <Account> vodafoneDataBase = new ArrayList<>(2);  // vodafone has 2 clients initially

        WalletAccount vodafoneClient1 = new WalletAccount("W1", "Vodafone", "reem", "01078140035", 109109, 1900, 200);
        WalletAccount vodafoneClient2 = new WalletAccount("W2", "Vodafone", "jana", "01096166035", 202100, 180, 990);

        vodafoneDataBase.add(vodafoneClient1);
        vodafoneDataBase.add(vodafoneClient2);

        DataBase d4= new VodafoneDataBase(vodafoneDataBase);

        // ---------------------------------------------------------------------------------

        // Orange DataBase
        // Supports Only Wallet Accounts!!

        ArrayList <Account> orangeDataBase = new ArrayList<>(2);  // orange has 2 clients initially

        WalletAccount orangeClient1 = new WalletAccount("W1", "Orange", "yara", "01078140095", 109189, 1980, 2980);
        WalletAccount orangneClient2 = new WalletAccount("W2", "Orange", "amr", "01096160035", 205100, 1880, 90);

        orangeDataBase.add(orangeClient1);
        orangeDataBase.add(orangneClient2);

        DataBase d5 = new OrangeDataBase(orangeDataBase);

        // ---------------------------------------------------------------------------------

        ArrayList <User> systemDataBase = new ArrayList<>(0);  // new system, no user registered yet

        InstaPayDB i = new InstaPayDB(systemDataBase);

        SignUp s1 = new BankAccountSignUp(i, d1); // i am the first user testing this system

        ArrayList <Account> myAccounts = new ArrayList<>(2);

        Account a1 = new BankAccount("B1", "CIB", "judy", "01098160035", 100100, 300, "Checking");
        Account a2 = new WalletAccount("W1", "Vodafone", "judy", "01098160035", 200200, 500,150);

          myAccounts.add(a1);
        myAccounts.add(a2);

        User u1 = new User("judy", "01098160035", " ", " ", myAccounts);

        s1.register(u1, a1);

        SignIn si1 = new SignIn(i);

        si1.signIn(u1, a2);

        *//*ArrayList <Account> aliAccounts = new ArrayList<>(1);

        Account ali1 = new BankAccount("B1", "CIB", "ali", "01098160037", 100100, 300, "Checking");

        aliAccounts.add(ali1);

        User u2 = new User("ali", "01098160037", "ali123", "a1789", aliAccounts);

        SignIn si = new SignIn(i);

        si.signIn(u1, a1);*/

        ArrayList <Account> vodafoneDataBase = new ArrayList<>(2);  // vodafone has 2 clients initially

        WalletAccount vodafoneClient1 = new WalletAccount("W1", "Vodafone", "reem", "01078140035", 109109, 1900, 200);
        WalletAccount vodafoneClient2 = new WalletAccount("W2", "Vodafone", "jana", "01096166035", 202100, 180, 990);

        vodafoneDataBase.add(vodafoneClient1);
        vodafoneDataBase.add(vodafoneClient2);

        DataBase d4= new VodafoneDataBase(vodafoneDataBase);

        WalletProvider vodafone = new Vodafone(d4);

        DigitalWallet v = new VodafoneCash(); // should take name of process as a parameter

        vodafone.createDigitalWallet(v);  // inside create digital wallet access d to implement transaction method

        ArrayList <User> systemDataBase = new ArrayList<>(1);  // new system, no user registered yet

        ArrayList <Account> aliAccounts = new ArrayList<>(1);

        Account ali1 = new BankAccount("B1", "CIB", "ali", "01098160037", 100100, 300, "Checking");

        aliAccounts.add(ali1);

        ArrayList <Bill> b = new ArrayList<>();

        b.add(new GasBill( 123.55, 1111, 1000,"pepsi adv"));

        User u = new User("ali", "01098160037", "ali123", "a1789", aliAccounts, b);

        systemDataBase.add(u);

        InstaPayDB i = new InstaPayDB(systemDataBase);

        Transference t = new TransferToBankAccount(i);

        Account ali2 = new BankAccount("B7", "CIB", "ali2", "01098960037", 100108, 3990, "Checking");

        t.transferMoney(ali1, ali2, 200);

        System.out.println("*******************");

        Inquiry inquiry = new BankAccountInquiry();

        inquiry.inquireAboutBalance(ali2);

        System.out.println("*******************");

        Bill bill = new GasBill(200, 140, 500, "adv");

        Payment p = new BankPayment();

        p.payBills(u, bill);

        System.out.println("*******************");

        SignUp s1 = new BankAccountSignUp(i, d4);

        ArrayList <Account> myAccounts = new ArrayList<>(2);

        Account a1 = new BankAccount("B1", "CIB", "judy", "01098160035", 100100, 300, "Checking");
        Account a2 = new WalletAccount("W1", "Vodafone", "judy", "01098160035", 200200, 500,150);

        myAccounts.add(a1);
        myAccounts.add(a2);

        s1.register(u, ali1);

        System.out.println("*******************");

        SignIn si1 = new SignIn(i);

        si1.signIn(u, ali1);












/*


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

        }*/
    }
}
