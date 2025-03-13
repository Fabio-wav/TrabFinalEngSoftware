package FactoryMethod.OrderMenu;

import AbstractFactory.FastFoodOrderFactory;
import AbstractFactory.GourmetOrderFactory;
import AbstractFactory.OrderFactory;
import Singleton.Logger;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class OrderFactoryTest {

    @BeforeEach
    public void setup() {
        Logger.getInstance().clear();
    }

    @Test
    public void testGourmetOrderFactory() {
        OrderFactory factory = new GourmetOrderFactory();
        Order order = factory.createOrder();
        Menu menu = factory.createMenu();

        assertTrue(order instanceof GourmetOrder, "Deve ser instância de GourmetOrder");
        assertEquals("Menu Gourmet: Bife, Salada, Vinho", menu.getMenu());
    }

    @Test
    public void testFastFoodOrderFactory() {
        OrderFactory factory = new FastFoodOrderFactory();
        Order order = factory.createOrder();
        Menu menu = factory.createMenu();

        assertTrue(order instanceof FastFoodOrder, "Deve ser instância de FastFoodOrder");
        assertEquals("Menu de Fast Food: Hamburguer, Batata, Refri", menu.getMenu());
    }
}

