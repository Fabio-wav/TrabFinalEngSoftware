package AbstractFactory;

import FactoryMethod.OrderMenu.*;

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
