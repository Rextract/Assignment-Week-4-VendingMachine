package org.example.Items;

import org.example.Product;
import org.example.VendingMachine;

public class Drinks {
    public class drinks implements VendingMachine {

        private String name = "Lemonade";
        private int price = 25;
        private int calories = 78;
        private String allergens = "Traces of Lemon";

        public drinks(String name, int price, int calories, String allergens) {
            this.name = name;
            this.price = price;
            this.calories = calories;
            this.allergens = allergens;
        }


        @Override
        public String examine() {
            return examine();
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
    }


}
