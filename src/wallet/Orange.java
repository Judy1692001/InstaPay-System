package wallet;

import dataBase.DataBase;

public class Orange extends TeleCommunicationCompany {
    public Orange(DataBase db) {
        super(db);
    }

    @Override
    public void createDigitalWallet(DigitalWallet dw) {
        dw.Service();
    }
}
