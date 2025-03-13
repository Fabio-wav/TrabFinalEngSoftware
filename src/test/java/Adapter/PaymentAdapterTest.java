package Adapter;


import Bridge.PaymentProcessor;
import Singleton.Logger;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class PaymentAdapterTest {

    @BeforeEach
    public void setup() {
        Logger.getInstance().clear();
    }

    @Test
    public void testPaymentAdapterCallsExternalSystem() {
        ExternalPaymentSystem externalPayment = new ExternalPaymentSystem();
        PaymentProcessor adapter = new PaymentAdapter(externalPayment);
        adapter.processPayment(75.0);

        // Verifica se o log contém a mensagem esperada
        String log = String.join(";", Logger.getInstance().getLogs());
        assertTrue(log.contains("Sistema de pagamento externo: Processando pagamento de $75.0"),
                "O log deve conter a mensagem do External Payment System");
    }
}