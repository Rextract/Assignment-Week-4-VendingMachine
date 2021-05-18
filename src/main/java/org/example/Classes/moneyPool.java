package org.example.Classes;

import org.example.ENUM.Coins;

public class moneyPool {

    public int number1KR;
    public int number2KR;
    public int number5KR;
    public int number10KR;
    public int number20KR;
    public int number50KR;
    public int number100KR;
    public int number200KR;
    public int number500KR;
    public int number1000KR;



    public moneyPool(int... addCurrency) {
        this.number1KR = addCurrency [0];
        this.number2KR = addCurrency [1];
        this.number5KR = addCurrency [2];
        this.number10KR = addCurrency [3];
        this.number20KR = addCurrency [4];
        this.number50KR = addCurrency [5];
        this.number100KR = addCurrency [6];
        this.number200KR = addCurrency [7];
        this.number500KR = addCurrency [8];
        this.number1000KR = addCurrency [9];
    }

    public int getTotal() {
        int total = 0;
        total = total + this.number1KR * Coins.ONE_SEK.getValue();
        total = total + this.number1KR * Coins.TWO_SEK.getValue();
        total = total + this.number1KR * Coins.FIVE_SEK.getValue();
        total = total + this.number1KR * Coins.TEN_SEK.getValue();
        total = total + this.number1KR * Coins.TWENTY_SEK.getValue();
        total = total + this.number1KR * Coins.FIFTY_SEK.getValue();
        total = total + this.number1KR * Coins.ONE_HUNDRED_SEK.getValue();
        total = total + this.number1KR * Coins.TWO_HUNDRED_SEK.getValue();
        total = total + this.number1KR * Coins.FIVE_HUNDRED_SEK.getValue();
        total = total + this.number1KR * Coins.ONE_THOUSAND_SEK.getValue();

        return total;
    }



}
