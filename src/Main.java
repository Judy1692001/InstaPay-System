import dataBase.*;
import registration.*;
import wallet.*;


public class Main {


    public static void main(String[] args) {

        /*
        CIB Accounts
         */

        Account c1 = new BankAccount("CIB","ali", "01098160035", 100100, 200);

        Account c2 = new BankAccount("CIB", "mohamed", "01092358207", 111111, 300);

        Account [] cibAccounts = new Account[2];

        cibAccounts[0] = c1;
        cibAccounts[1] = c2;

        /*
        CIB DataBase is now ready
         */

        DataBase cibDB = new CIBDataBase(cibAccounts);

        /*
        Banque Masr Accounts
         */

        Account b1 = new BankAccount("BanqueMasr", "ali", "01092678854", 199888, 200);

        Account b2 = new BankAccount("BanqueMasr", "yara", "01092234451", 200200, 700);

        Account [] banqueMasrAccounts = new Account[2];

        banqueMasrAccounts[0] = b1;
        banqueMasrAccounts[1] = b2;

        /*
        BanqueMasr DataBase is now ready
         */

        DataBase banqueMasrDB = new BanqueMasrDataBase(banqueMasrAccounts);

        /*
        Vodafone Accounts
         */

        Account v1 = new WalletAccount("Vodafone Cash", "judy", "01098160035", 100100, 900);

        Account v2 = new WalletAccount("Vodafone Cash", "salma", "01092225678", 299899, 300);

        Account [] vodafoneCashAccounts = new WalletAccount[2];

        vodafoneCashAccounts[0] = v1;
        vodafoneCashAccounts[1] = v2;

        /*
        Vodafone DataBase is now ready
         */

        DataBase vodafoneDB = new TeleCommunicationDataBase(vodafoneCashAccounts);

        /*
        Orange Accounts
         */

        Account o1 = new WalletAccount("Orange Cash", "salma", "01095678876", 200300, 600);

        Account o2 = new WalletAccount("Orange Cash", "menna", "01095564378", 900900, 800);

        Account [] orangeCashAccounts = new WalletAccount[2];

        orangeCashAccounts[0] = o1;
        orangeCashAccounts[1] = o2;

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