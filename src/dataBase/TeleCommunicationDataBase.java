package dataBase;

import registration.Account;
import registration.WalletAccount;

import java.util.ArrayList;

public abstract class TeleCommunicationDataBase extends DataBase{

    public TeleCommunicationDataBase(ArrayList<Account> db) {
        super(db);
    }
}
