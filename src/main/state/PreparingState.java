package main.state;
import main.FactoryMethod.OrderMenu.Order;

public class PreparingState implements OrderState{
    private Order order;

    public PreparingState(Order order) {
        this.order = order;
    }

    @Override
    public void next() {
        order.setState(new OnTheWayState(order));
    }

    @Override
    public void prev() {
        order.setState(new PendingState(order));
    }

    @Override
    public String getState() {
        return "Preparando";
    }
}
