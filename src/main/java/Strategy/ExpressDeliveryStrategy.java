package Strategy;

public class ExpressDeliveryStrategy implements DeliveryFeeStrategy{
    @Override
    public double calculateFee(double orderTotal) {
        return 10;
    }

}
