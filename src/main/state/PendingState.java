package main.state;
import main.FactoryMethod.OrderMenu.Order;
import main.Singleton.Logger;

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
