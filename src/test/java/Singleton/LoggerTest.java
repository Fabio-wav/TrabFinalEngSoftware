package Singleton;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class LoggerTest {

    @BeforeEach
    public void setup() {
        Logger.getInstance().clear();
    }

    @Test
    public void testSingletonInstance() {
        Logger logger1 = Logger.getInstance();
        Logger logger2 = Logger.getInstance();
        assertSame(logger1, logger2, "Deve retornar a mesma instância do Logger");
    }

    @Test
    public void testLogMessages() {
        Logger logger = Logger.getInstance();
        logger.log("Test message");
        assertEquals(1, logger.getLogs().size(), "Deve haver apenas uma mensagem logada");
        assertEquals("Test message", logger.getLogs().get(0));
    }
}
