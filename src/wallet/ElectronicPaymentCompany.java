package wallet;

import dataBase.DataBase;

public abstract class ElectronicPaymentCompany extends WalletProvider {

    public ElectronicPaymentCompany(DataBase db)
    {
        super(db);
    }
}
