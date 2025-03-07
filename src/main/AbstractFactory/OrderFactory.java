package main.AbstractFactory;
import main.FactoryMethod.Menu;
import main.FactoryMethod.Order;

public interface OrderFactory {
    Order createOrder();
    Menu createMenu();
}
