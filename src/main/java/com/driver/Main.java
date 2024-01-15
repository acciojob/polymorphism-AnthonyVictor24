package com.driver;

public class Main {
    public static class Product{
        public int product(int x, int y) {
            return 0;
        }
        public int product(int x, int y, int z) {
            return 0;
        }
        public double product(double x, double y) {
            return 0.0;
        }
    }
    public static void main(String[] args) {
//create object of Product in Main function called p
        Product p = new Product();
        p.product(5,6);
        p.product(1,3,4);
        p.product(2.0,3.0);
    }
}