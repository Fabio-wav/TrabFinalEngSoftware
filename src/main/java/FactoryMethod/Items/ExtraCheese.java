package FactoryMethod.Items;

public class ExtraCheese extends OrderItemDecorator {
    public ExtraCheese(OrderItem orderItem) {
        super(orderItem);
    }

    @Override
    public String getName() {
        return orderItem.getName() + " + Queijo Adicional";
    }

    @Override
    public double getPrice() {
        return orderItem.getPrice() + 1.50;
    }
}
