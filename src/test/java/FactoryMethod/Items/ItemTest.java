package FactoryMethod.Items;
import FactoryMethod.OrderMenu.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class ItemTest {

    private Order order;

    @BeforeEach
    public void setup() {
        order = new FastFoodOrder();
    }

    @Test
    public void testFactoryMethod() {
        OrderItem item = order.createItem("Hamburguer");
        assertNotNull(item, "O item não deve ser nulo");
        assertEquals("Hamburguer", item.getName());
        assertEquals(8.99, item.getPrice(), 0.01);
    }

    @Test
    public void testDecoratorExtraCheese() {
        OrderItem item = order.createItem("Hamburguer");
        item = new ExtraCheese(item);
        assertTrue(item.getName().contains("Queijo Adicional"));
        assertEquals(8.99 + 1.50, item.getPrice(), 0.01);
    }

    @Test
    public void testDecoratorExtraSauce() {
        OrderItem item = order.createItem("Hamburguer");
        item = new ExtraSauce(item);
        assertTrue(item.getName().contains("Molho Adicional"));
        assertEquals(8.99 + 0.75, item.getPrice(), 0.01);
    }
}
