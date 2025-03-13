package Template;


import Adapter.*;
import Bridge.*;
import FactoryMethod.OrderMenu.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class OrderProcessorTest {
    private Order order;

    @BeforeEach
    public void setup() {
        // Usando FastFoodOrder para o teste
        order = new FastFoodOrder();
    }

    @Test
    public void testOrderProcessorCompletesOrder() {
        ExternalPaymentSystem externalPayment = new ExternalPaymentSystem();
        PaymentProcessor processor = new PaymentAdapter(externalPayment);
        Payment payment = new CreditCardPayment(processor);
        OrderProcessor orderProcessor = new FoodOrderProcessor(payment);

        orderProcessor.processOrder(order);
        assertEquals("Entregue", order.getState().getState());
    }
}
