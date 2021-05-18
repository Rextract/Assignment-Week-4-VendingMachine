package org.example.INTERFACES;

import org.example.Classes.DepositMoneyPool.moneyPool;

public interface Calculator {

    int calculateTotal (moneyPool addCurrency);
    moneyPool calculateChange(int coinsInserted);


}
