package org.example;

public enum Denominations {

    KR1(1),
    KR2(2),
    KR5(5),
    KR10(10),
    KR20(20),
    KR50(50),
    KR100(100),
    KR200(200),
    KR500(500),
    KR1000(1000);



    private int KRONOR;

    private Denominations (int KRONOR){
        this.KRONOR = KRONOR;
    }

    public int getKRONOR(){
        return KRONOR;
    }



}
