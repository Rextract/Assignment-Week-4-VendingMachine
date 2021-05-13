package org.example;

import static javafx.scene.input.KeyCode.K;
import static sun.plugin2.main.client.PluginProxySelector.initialize;

public class VendingMachineImpl implements VendingMachine {

    private price<KR> depositPool = new price<KR>();
    private name<Product> nameProduct = new name<Product>();
    private int calories;
    private String allergens;

    public VendingMachineImpl(){
        initialize();
    }






    @Override
    public int price() {
        return (KR k : KR.values()){
            depositPool.put(K, 5)
        }
    }

    @Override
    public String name() {
        return null;
    }

    @Override
    public int calories() {
        return 0;
    }

    @Override
    public String allergens() {
        return null;
    }

    @Override
    public String examine(int price, String name, int calories, String allergens) {
        return null;
    }

    @Override
    public String use() {
        return null;
    }

    @Override
    public int addCurrency(int amount) {
        return 0;
    }

    @Override
    public Product request(int productNumber) {
        return null;
    }

    @Override
    public int endSession() {
        return 0;
    }

    @Override
    public String getDescription(int productNumber) {
        return null;
    }

    @Override
    public int getBalance() {
        return 0;
    }

    @Override
    public String[] getProducts() {
        return new String[0];
    }

    private static class KR {
    }

    private class price<T> {
    }

    private class name<T> {
    }
}
