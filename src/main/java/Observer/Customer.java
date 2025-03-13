package Observer;
import FactoryMethod.OrderMenu.Order;

public class Customer  implements OrderObserver{
    private String name;
    private String lastNotification;

    public Customer(String name) {
        this.name = name;
    }

    @Override
    public void update(Order order) {
        lastNotification = "Notificando " + name + ": Pedido está " + order.getState().getState();
    }

    public String getLastNotification() {
        return lastNotification;
    }
}
