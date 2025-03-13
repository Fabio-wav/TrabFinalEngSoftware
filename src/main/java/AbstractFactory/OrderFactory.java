package AbstractFactory;
import FactoryMethod.OrderMenu.*;

public interface OrderFactory {
    Order createOrder();
    Menu createMenu();
}
