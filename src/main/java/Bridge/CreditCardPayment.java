package Bridge;

import Singleton.Logger;

public class CreditCardPayment extends Payment {
    public CreditCardPayment(PaymentProcessor processor) {
        super(processor);
    }

    @Override
    public void pay(double amount) {
        Logger.getInstance().log("Pagamento de cartao de credito: pagando $" + amount);
        processor.processPayment(amount);
    }
}
