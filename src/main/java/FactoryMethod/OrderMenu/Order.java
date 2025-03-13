package FactoryMethod.OrderMenu;
import State.*;
import FactoryMethod.Items.OrderItem;
import Observer.*;

public abstract class Order {
    protected String description;
    protected OrderState state;

    public Order() {
        this.state = new PendingState(this);
    }

    public abstract void prepare();
    public abstract OrderItem createItem(String type);

    public void setState(OrderState state) {
        this.state = state;
        OrderEventManager.getInstance().notifyObservers(this);
    }

    public OrderState getState() {
        return state;
    }

    public String getDescription() {
        return description;
    }
}
