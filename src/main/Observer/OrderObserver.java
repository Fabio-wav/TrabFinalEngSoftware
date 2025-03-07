package main.Observer;
import main.FactoryMethod.OrderMenu.Order;

public interface OrderObserver {
    void update(Order order);
}
