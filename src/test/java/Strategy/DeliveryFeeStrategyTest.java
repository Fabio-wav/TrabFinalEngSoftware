package Strategy;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class DeliveryFeeStrategyTest {

    @Test
    public void testStandardDeliveryFee() {
        DeliveryFeeStrategy standard = new StandardDeliveryStrategy();
        double fee = standard.calculateFee(30);
        assertEquals(5.0, fee, 0.01);
        fee = standard.calculateFee(60);
        assertEquals(0.0, fee, 0.01);
    }

    @Test
    public void testExpressDeliveryFee() {
        DeliveryFeeStrategy express = new ExpressDeliveryStrategy();
        double fee = express.calculateFee(30);
        assertEquals(10.0, fee, 0.01);
    }
}