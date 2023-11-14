import dataBase.*;
import registration.*;
import wallet.*;

import java.util.ArrayList;


public class Main {


    public static void main(String[] args) {

        /*
        CIB Accounts
         */

        Account c1 = new BankAccount("CIB","ali", "01098160035", 100100, 200);

        Account c2 = new BankAccount("CIB", "mohamed", "01092358207", 111111, 300);

        ArrayList<Account> cibAccounts=new ArrayList<>();

        cibAccounts.add(c1);
        cibAccounts.add(c2);

        /*
        CIB DataBase is now ready
         */

        DataBase cibDB = new CIBDataBase(cibAccounts);

        /*
        Banque Masr Accounts
         */

        Account b1 = new BankAccount("BanqueMasr", "ali", "01092678854", 199888, 200);

        Account b2 = new BankAccount("BanqueMasr", "yara", "01092234451", 200200, 700);

        ArrayList<Account> banqueMasrAccounts=new ArrayList<>();

        banqueMasrAccounts.add(b1);
        banqueMasrAccounts.add(b1);

        /*
        BanqueMasr DataBase is now ready
         */


        DataBase banqueMasrDB = new BanqueMasrDataBase(banqueMasrAccounts);

        /*
        Vodafone Accounts
         */

        Account v1 = new WalletAccount("Vodafone Cash", "judy", "01098160035", 100100, 900);

        Account v2 = new WalletAccount("Vodafone Cash", "salma", "01092225678", 299899, 300);

        ArrayList<Account> vodafoneCashAccounts=new ArrayList<>();

        vodafoneCashAccounts.add(v1);
        vodafoneCashAccounts.add(v2);

        /*
        Vodafone DataBase is now ready
         */

        DataBase vodafoneDB = new VodafoneDataBase(vodafoneCashAccounts);

        /*
        Orange Accounts
         */

        Account o1 = new WalletAccount("Orange Cash", "salma", "01095678876", 200300, 600);

        Account o2 = new WalletAccount("Orange Cash", "menna", "01095564378", 900900, 800);

        ArrayList<Account> orangeCashAccounts=new ArrayList<>();

        orangeCashAccounts.add(o1);
        orangeCashAccounts.add(o2);

        /*
        Orange DataBase is now ready
         */

        DataBase orangeDB = new OrangeDataBase(orangeCashAccounts);

        /*
        Provide each Bank / Company with it's suitable database
         */

        Bank cib = new CIB(cibDB);

        Bank banqueMasr = new BanqueMasr(banqueMasrDB);

        TeleCommunicationCompany vodafone = new Vodafone(vodafoneDB);

        TeleCommunicationCompany orange = new Orange(orangeDB);

        ElectronicPaymentCompany fawry = new Fawry(vodafoneDB);
    }
}