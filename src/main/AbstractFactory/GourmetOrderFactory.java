package main.AbstractFactory;

import main.FactoryMethod.GourmetMenu;
import main.FactoryMethod.GourmetOrder;
import main.FactoryMethod.Menu;
import main.FactoryMethod.Order;

public class GourmetOrderFactory implements OrderFactory{
    @Override
    public Order createOrder() {
        return new GourmetOrder();
    }

    @Override
    public Menu createMenu() {
        return new GourmetMenu();
    }
}
