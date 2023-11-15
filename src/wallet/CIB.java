package wallet;

import dataBase.DataBase;

public class CIB extends Bank {

    public CIB(DataBase db) {
        super(db);
    }

    @Override
    public void createDigitalWallet(DigitalWallet dw) {
        dw.Service();
    }
}
