package org.example.ENUM;

public class DepositPool {

    public int number1;
    public int number2;
    public int number5;
    public int number10;
    public int number20;
    public int number50;
    public int number100;
    public int number200;
    public int number500;
    public int number1000;

    public DepositPool(int addCurrency) {
        this.number1 = addCurrency[0];
        this.number2 = addCurrency[1];
        this.number5 = addCurrency[2];
        this.number10 = addCurrency[3];
        this.number20 = addCurrency[4];
        this.number50 = addCurrency[5];
        this.number100 = addCurrency[6];
        this.number200 = addCurrency[7];
        this.number500 = addCurrency[8];
        this.number1000 = addCurrency[9];


    }


}
