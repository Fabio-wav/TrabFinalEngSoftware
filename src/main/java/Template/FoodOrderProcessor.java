package Template;
import FactoryMethod.OrderMenu.Order;
import Singleton.Logger;
import Bridge.Payment;

public class FoodOrderProcessor extends OrderProcessor {
    private Payment payment;

    public FoodOrderProcessor(Payment payment) {
        this.payment = payment;
    }

    @Override
    protected void processPayment(Order order) {
        double orderTotal = calculateOrderTotal(order);
        Logger.getInstance().log("Processando pagamento para: " + order.getDescription());
        payment.pay(orderTotal);
    }

    private double calculateOrderTotal(Order order) {
        // Para simplificação, retorna um valor fixo.
        return 20.0;

    }
}
