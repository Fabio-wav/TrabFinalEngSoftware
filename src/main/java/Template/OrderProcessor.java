package Template;
import FactoryMethod.OrderMenu.Order;
import Singleton.Logger;
import State.DeliveredState;

public abstract class OrderProcessor {
    public final void processOrder(Order order) {
        validateOrder(order);
        order.prepare();
        processPayment(order);
        deliverOrder(order);
        completeOrder(order);
    }

    protected void validateOrder(Order order) {
        Logger.getInstance().log("Validando pedido: " + order.getDescription());
    }

    protected abstract void processPayment(Order order);

    protected void deliverOrder(Order order) {
        Logger.getInstance().log("Entregando pedido: " + order.getDescription());
    }

    protected void completeOrder(Order order) {
        order.setState(new DeliveredState(order));
        Logger.getInstance().log("Pedido completado: " + order.getDescription());
    }
}
