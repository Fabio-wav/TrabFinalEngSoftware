package State;
import FactoryMethod.OrderMenu.Order;

public class OnTheWayState implements OrderState{
    private Order order;

    public OnTheWayState(Order order) {
        this.order = order;
    }

    @Override
    public void next() {
        order.setState(new DeliveredState(order));
    }

    @Override
    public void prev() {
        order.setState(new PreparingState(order));
    }

    @Override
    public String getState() {
        return "Em entrega";
    }
}
