package wallet;

import dataBase.DataBase;
import registration.Account;

public class Vodafone extends TeleCommunicationCompany {

    public Vodafone(DataBase db) {
        super(db);
    }

    @Override
    public void createDigitalWallet(DigitalWallet dw) {
        dw.Service();
    }
}
