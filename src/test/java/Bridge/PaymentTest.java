package Bridge;

import Singleton.Logger;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class PaymentTest {

    @BeforeEach
    public void setup() {
        Logger.getInstance().clear();
    }

    @Test
    public void testCreditCardPayment() {
        PaymentProcessor processor = new CreditCardPaymentProcessor();
        Payment payment = new CreditCardPayment(processor);
        payment.pay(50.0);

        // Verifica se as mensagens foram logadas conforme esperado
        String log = String.join(";", Logger.getInstance().getLogs());
        assertTrue(log.contains("Pagamento de cartao de credito: pagando $50.0"), "Deve conter log de pagamento com cartão");
        assertTrue(log.contains("Processando pagamento de cartao de credito: $50.0"), "Deve conter log de processamento de pagamento");
    }
}
