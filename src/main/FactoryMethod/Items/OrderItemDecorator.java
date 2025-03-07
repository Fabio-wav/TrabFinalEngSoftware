package main.FactoryMethod.Items;

public abstract class OrderItemDecorator {
    protected OrderItem orderItem;

    public OrderItemDecorator(OrderItem orderItem) {
        this.orderItem = orderItem;
    }

    public abstract String getName();

    public abstract double getPrice();
}
