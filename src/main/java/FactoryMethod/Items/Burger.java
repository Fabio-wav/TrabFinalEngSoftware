package FactoryMethod.Items;

public class Burger extends OrderItem {
    @Override
    public String getName() {
        return "Hamburguer";
    }
    @Override
    public double getPrice() {
        return 8.99;
    }
}
