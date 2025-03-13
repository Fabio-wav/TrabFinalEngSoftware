package Observer;
import java.util.ArrayList;
import java.util.List;
import FactoryMethod.OrderMenu.Order;

public class OrderEventManager {
    private static OrderEventManager instance;
    private List<OrderObserver> observers= new ArrayList<>();

    private OrderEventManager() {}

    public static OrderEventManager getInstance() {
        if(instance == null) {
            instance = new OrderEventManager();
        }
        return instance;
    }

    public void subscribe(OrderObserver observer) {
        observers.add(observer);
    }

    public void unsubscribe(OrderObserver observer) {
        observers.remove(observer);
    }

    public void notifyObservers(Order order) {
        for(OrderObserver observer : observers) {
            observer.update(order);
        }
    }

}
