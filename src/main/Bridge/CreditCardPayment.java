package main.Bridge;

import main.Singleton.Logger;

public class CreditCardPayment extends Payment {
    public CreditCardPayment(PaymentProcessor processor) {
        super(processor);
    }

    @Override
    public void pay(double amount) {
        Logger.getInstance().log("CreditCardPayment: paying $" + amount);
        processor.processPayment(amount);
    }
}
