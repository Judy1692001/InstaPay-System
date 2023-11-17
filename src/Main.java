import dataBase.*;
import registration.*;
import wallet.*;
import billsPayment.*;

import java.util.ArrayList;


public class Main {


    public static void main(String[] args) {
        //testing registration package

        //important!! fill in system database
        /*User u1 = new User("ali", "01098160035", myAccounts);
        User u2 = new User("amr", "01098160033", myAccounts);
        User u3 = new User("hoda", "01098160065", myAccounts);
        User u4 = new User("yara", "01098169035", myAccounts);
        User u5 = new User("rana", "01098360035", myAccounts);*/
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

        ArrayList <WalletAccount> vodafoneDataBase = new ArrayList<>(2);  // vodafone has 2 clients initially

        WalletAccount vodafoneClient1 = new WalletAccount("W1", "Vodafone", "reem", "01078140035", 109109, 1900, 200);
        WalletAccount vodafoneClient2 = new WalletAccount("W2", "Vodafone", "jana", "01096166035", 202100, 180, 990);

        vodafoneDataBase.add(vodafoneClient1);
        vodafoneDataBase.add(vodafoneClient2);

        DataBase d4= new VodafoneDataBase(vodafoneDataBase);

        // ---------------------------------------------------------------------------------

        // Orange DataBase
        // Supports Only Wallet Accounts!!

        ArrayList <WalletAccount> orangeDataBase = new ArrayList<>(2);  // orange has 2 clients initially

        WalletAccount orangeClient1 = new WalletAccount("W1", "Orange", "yara", "01078140095", 109189, 1980, 2980);
        WalletAccount orangneClient2 = new WalletAccount("W2", "Orange", "amr", "01096160035", 205100, 1880, 90);

        orangeDataBase.add(orangeClient1);
        orangeDataBase.add(orangneClient2);

//        DataBase d5 = new OrangeDataBase(orangeDataBase);

        // ---------------------------------------------------------------------------------

        ArrayList <User> systemDataBase = new ArrayList<>(0);  // new system, no user registered yet

        InstaPayDB i = new InstaPayDB(systemDataBase);

        SignUp s1 = new BankAccountSignUp(i, d1); // i am the first user testing this system

        ArrayList <Account> myAccounts = new ArrayList<>(2);

        Account a1 = new BankAccount("B1", "CIB", "judy", "01098160035", 100100, 300, "Checking");
//        Account a2 = new WalletAccount("W1", "Vodafone", "judy", "01098160035", 200200, 500, 150);

        myAccounts.add(a1);
//        myAccounts.add(a2);

        User u1 = new User("judy", "01098160035", " ", " ", myAccounts);

        s1.register(u1, a1);

        ArrayList <Account> aliAccounts = new ArrayList<>(1);

        Account ali1 = new BankAccount("B1", "CIB", "ali", "01098160037", 100100, 300, "Checking");

        aliAccounts.add(ali1);

        User u2 = new User("ali", "01098160037", "ali123", "a1789", aliAccounts);

        SignIn si = new SignIn(i);

        si.signIn(u1, a1);
    }
}
