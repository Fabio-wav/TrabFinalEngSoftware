package FactoryMethod.Items;

public class Steak extends OrderItem {
    @Override
    public String getName() {
        return "Bife";
    }
    @Override
    public double getPrice() {
        return 12.99;
    }
}
