package main.FactoryMethod;

public class OrderItemDecorator {
    protected OrderItem orderItem;

    public OrderItemDecorator(OrderItem orderItem) {
        this.orderItem = orderItem;
    }

}
