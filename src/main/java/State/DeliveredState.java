package State;
import FactoryMethod.OrderMenu.Order;
import Singleton.Logger;

public class DeliveredState implements OrderState {
    private Order order;

    public DeliveredState(Order order) {
        this.order = order;
    }

    @Override
    public void next() {
        Logger.getInstance().log("O pedido já foi entregue.");
    }

    @Override
    public void prev() {
        order.setState(new OnTheWayState(order));
    }

    @Override
    public String getState() {
        return "Entregue";
    }
}
