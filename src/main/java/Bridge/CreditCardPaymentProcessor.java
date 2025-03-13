package Bridge;

import Singleton.Logger;

public class CreditCardPaymentProcessor implements PaymentProcessor {
    @Override
    public void processPayment(double amount) {
        Logger.getInstance().log("Processando pagamento de cartao de credito: $" + amount);
    }
}
