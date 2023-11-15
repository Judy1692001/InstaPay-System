package wallet;

import dataBase.DataBase;

public abstract class Bank extends WalletProvider {

    public Bank(DataBase db)
    {
        super(db);
    }

}
