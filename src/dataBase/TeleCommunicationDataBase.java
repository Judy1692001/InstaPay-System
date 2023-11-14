package dataBase;

import dataBase.DataBase;
import registration.Account;

import java.util.ArrayList;

public abstract class TeleCommunicationDataBase extends DataBase {

    public TeleCommunicationDataBase(ArrayList <Account> db) {
        super(db);
    }
}
