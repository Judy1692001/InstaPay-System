package dataBase;

import registration.Account;

import java.util.ArrayList;

public abstract class BankDataBase extends DataBase{
    public BankDataBase(ArrayList<Account> db) {
        super(db);
    }
}
