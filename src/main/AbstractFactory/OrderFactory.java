package main.AbstractFactory;
import main.FactoryMethod.OrderMenu.*;

public interface OrderFactory {
    Order createOrder();
    Menu createMenu();
}
