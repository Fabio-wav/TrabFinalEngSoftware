package main.FactoryMethod.Items;

public class OrderItemDecorator {
    protected OrderItem orderItem;

    public OrderItemDecorator(OrderItem orderItem) {
        this.orderItem = orderItem;
    }

}
