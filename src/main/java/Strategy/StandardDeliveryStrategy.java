package Strategy;

public class StandardDeliveryStrategy implements DeliveryFeeStrategy {
    @Override
    public double calculateFee(double orderTotal){
        return orderTotal > 50 ? 0 : 5;
    }
}
