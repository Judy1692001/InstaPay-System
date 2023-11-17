package registration;

import dataBase.CIBDataBase;
import dataBase.*;

public class BankAccountSignUp extends SignUp {

    public BankAccountSignUp(InstaPayDB systemDB, DataBase companyDB) {
        super(systemDB, companyDB);
    }

    @Override
    public boolean authenticateUser(Account account) {

        if(account.getProviderName() == "CIB")
        {
            for(Account a : getCompanyDB().getDB())
            {
                if(a.getHolderMobileNumber() == account.getHolderMobileNumber())
                    return true;
            }

            return false;
        }
        else if(account.getProviderName() == "BanqueMasr")
        {
            for(Account a : getCompanyDB().getDB())
            {
                if(a.getHolderMobileNumber() == account.getHolderMobileNumber())
                    return true;
            }

            return false;
        }

        System.out.println("Bank not found, please try again");

        return false;
    }
}
