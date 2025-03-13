package FactoryMethod.OrderMenu;
import State.PreparingState;
import FactoryMethod.Items.*;
import Singleton.Logger;


public class FastFoodOrder extends Order {
    public FastFoodOrder() {
        this.description = "Pedido de fast food";
    }

    @Override
    public void prepare() {
        Logger.getInstance().log("Preparando pedido de fast food.");
        setState(new PreparingState(this));
    }

    @Override
    public OrderItem createItem(String type) {
        if(type.equalsIgnoreCase("hamburguer")) {
            return new Burger();
        } else if(type.equalsIgnoreCase("batata")) {
            return new Fries();
        }
        return null;
    }

    public abstract static class OrderItemDecorator extends OrderItem {
        protected OrderItem orderItem;

        public OrderItemDecorator(OrderItem orderItem) {
            this.orderItem = orderItem;
        }
    }
}
