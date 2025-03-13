package Observer;
import FactoryMethod.OrderMenu.Order;

public interface OrderObserver {
    void update(Order order);
}
