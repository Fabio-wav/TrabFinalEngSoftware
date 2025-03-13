package Adapter;
import Singleton.Logger;

public class ExternalPaymentSystem {
    public void makePayment(double amount) {
        Logger.getInstance().log("Sistema de pagamento externo: Processando pagamento de $" + amount);
    }
}
