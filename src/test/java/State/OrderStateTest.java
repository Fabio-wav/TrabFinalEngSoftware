package State;

import FactoryMethod.OrderMenu.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class OrderStateTest {
    private Order order;

    @BeforeEach
    public void setup() {
        order = new FastFoodOrder();
    }

    @Test
    public void testInitialState() {
        assertEquals("Pendente", order.getState().getState());
    }

    @Test
    public void testStateTransitions() {
        order.prepare();  // Deve mudar para "Preparing"
        assertEquals("Preparando", order.getState().getState());
        order.getState().next(); // Deve mudar para "On The Way"
        assertEquals("Em entrega", order.getState().getState());
        order.getState().next(); // Deve mudar para "Delivered"
        assertEquals("Entregue", order.getState().getState());
    }

    @Test
    public void testStateReverse() {
        order.prepare();
        order.getState().next();
        order.getState().prev();
        assertEquals("Preparando", order.getState().getState());
    }
}
