package main.AbstractFactory;

import main.FactoryMethod.FastFoodMenu;
import main.FactoryMethod.FastFoodOrder;
import main.FactoryMethod.Menu;
import main.FactoryMethod.Order;

public class FastFoodOrderFactory implements OrderFactory {
    @Override
    public Order createOrder() {
        return new FastFoodOrder();
    }

    @Override
    public Menu createMenu() {
        return new FastFoodMenu();
    }
}
