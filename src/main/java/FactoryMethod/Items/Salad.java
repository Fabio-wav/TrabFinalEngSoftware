package FactoryMethod.Items;

public class Salad extends OrderItem {
    @Override
    public String getName() {
        return "Salada";
    }
    @Override
    public double getPrice() {
        return 12.99;
    }
}
