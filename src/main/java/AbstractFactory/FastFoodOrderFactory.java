package AbstractFactory;
import FactoryMethod.OrderMenu.*;

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
