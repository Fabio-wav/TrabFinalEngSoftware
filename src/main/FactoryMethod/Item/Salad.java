package main.FactoryMethod.Item;

public class Salad extends OrdemItem{
    @Override
    public String getName() {
        return "Salada";
    }
    @Override
    public double getPrice() {
        return 12.99;
    }
}
