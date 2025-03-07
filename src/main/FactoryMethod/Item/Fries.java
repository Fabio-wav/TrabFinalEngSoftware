package main.FactoryMethod.Item;

public class Fries extends OrderItem {
    @Override
    public String getName() {
        return "Batata";
    }
    @Override
    public double getPrice() {
        return 3.99;
    }
}
