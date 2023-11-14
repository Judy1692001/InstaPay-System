package registration;

import dataBase.CIBDataBase;
import dataBase.DataBase;

public class BankAccountSignUp extends SignUp{
    public BankAccountSignUp(InstaPayDB systemDataBase) {
        super(systemDataBase);
    }

    @Override
    public void authenticateUser(User u, Account account) {


//        if(account.getProviderName() == "CIB")
//        {
//            DataBase db = new CIBDataBase();
//                    db.matchMobileNumber();
//        }
    }
}
