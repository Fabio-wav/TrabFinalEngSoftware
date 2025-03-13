package State;
import FactoryMethod.OrderMenu.Order;
import Singleton.Logger;

public class PendingState implements OrderState{
    private Order order;

    public PendingState(Order order) {
        this.order = order;
    }

    @Override
    public void next() {
        order.setState(new PreparingState(order));
    }

    @Override
    public void prev() {
        Logger.getInstance().log("O pedido já está no estado inicial.");
    }

    @Override
    public String getState() {
        return "Pendente";
    }
}
