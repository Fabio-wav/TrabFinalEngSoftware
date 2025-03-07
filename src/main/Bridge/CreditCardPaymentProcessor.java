package main.Bridge;

public class CreditCardPaymentProcessor implements PaymentProcessor {
    @Override
    public void processPayment(double amount) {
        Logger.getInstance().log("Processing credit card payment: $" + amount);
    }
}
