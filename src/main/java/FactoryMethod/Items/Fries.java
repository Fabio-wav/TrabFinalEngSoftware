package FactoryMethod.Items;

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
