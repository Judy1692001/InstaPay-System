package wallet;

import dataBase.DataBase;

public class BanqueMasr extends Bank {

    public BanqueMasr(DataBase db) {
        super(db);
    }

    @Override
    public void createDigitalWallet(DigitalWallet dw) {

        dw.Service();
    }
}
