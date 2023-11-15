package wallet;

import dataBase.DataBase;
import registration.*;

public abstract class WalletProvider {

    private DataBase db;

    public WalletProvider(DataBase db)
    {
        this.db = db;
    }

    public void setDB(DataBase db)
    {
        this.db = db;
    }

    public DataBase getDB()

    {
        return db;
    }

    public abstract void createDigitalWallet(DigitalWallet dw);
}
