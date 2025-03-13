package Adapter;
import Bridge.PaymentProcessor;

public class PaymentAdapter implements PaymentProcessor {
    private ExternalPaymentSystem externalPayment;

    public PaymentAdapter(ExternalPaymentSystem externalPayment) {
        this.externalPayment = externalPayment;
    }

    @Override
    public void processPayment(double amount) {
        externalPayment.makePayment(amount);
    }
}
