package FactoryMethod.OrderMenu;
import FactoryMethod.Items.*;
import Singleton.Logger;
import State.PreparingState;


public class GourmetOrder extends Order {

    public GourmetOrder() {
        this.description = "Pedido Gourmet";
    }

    @Override
    public void prepare() {
        Logger.getInstance().log("Preparando pedido gourmet.");
        setState(new PreparingState(this));
    }

    @Override
    public OrderItem createItem(String type) {
        if(type.equalsIgnoreCase("bife")) {
            return new Steak();
        } else if(type.equalsIgnoreCase("salada")) {
            return new Salad();
        }
        return null;
    }
}
