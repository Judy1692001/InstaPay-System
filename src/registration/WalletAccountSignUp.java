package registration;

import dataBase.DataBase;

public class WalletAccountSignUp extends SignUp{
    public WalletAccountSignUp(InstaPayDB systemDB, DataBase companyDB) {
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
        else if(account.getProviderName() == "Vodafone")
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
        else if(account.getProviderName() == "Orange")
        {
            for(Account a : getCompanyDB().getDB())
            {
                if(a.getHolderMobileNumber() == account.getHolderMobileNumber())
                    return true;
            }

            return false;
        }
        else if(account.getProviderName() == "Fawry")
        {
            for(Account a : getCompanyDB().getDB())
            {
                if(a.getHolderMobileNumber() == account.getHolderMobileNumber())
                    return true;
            }

            return false;
        }

        System.out.println("Company not found, please try again");

        return false;
    }
}
