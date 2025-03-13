package FactoryMethod.Items;

public abstract class OrderItemDecorator extends OrderItem {
    protected OrderItem orderItem;

    public OrderItemDecorator(OrderItem orderItem) {
        this.orderItem = orderItem;
    }

    public abstract String getName();

    public abstract double getPrice();
}
