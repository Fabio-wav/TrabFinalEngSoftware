package Observer;

import FactoryMethod.OrderMenu.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class ObserverTest {
    private Order order;
    private Customer customer;

    @BeforeEach
    public void setup() {
        order = new GourmetOrder();
        customer = new Customer("Ana");
        OrderEventManager.getInstance().subscribe(customer);
    }

    @Test
    public void testObserverNotificationOnStateChange() {
        order.prepare();
        String expected = "Notificando Ana: Pedido está Preparando";
        assertEquals(expected, customer.getLastNotification());
    }
}