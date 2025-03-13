package Bridge;

public abstract class Payment {
    protected PaymentProcessor processor;

    public Payment(PaymentProcessor processor) {
        this.processor = processor;
    }

    public abstract void pay(double amount);
}
