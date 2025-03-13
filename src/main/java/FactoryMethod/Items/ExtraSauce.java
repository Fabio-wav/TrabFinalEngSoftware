package FactoryMethod.Items;

public class ExtraSauce extends OrderItemDecorator {
    public ExtraSauce(OrderItem orderItem) {
        super(orderItem);
    }

    @Override
    public String getName() {
        return orderItem.getName() + " + Molho Adicional";
    }

    @Override
    public double getPrice() {
        return orderItem.getPrice() + 0.75;
    }
}

