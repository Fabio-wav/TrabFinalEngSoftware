package State;

public interface OrderState {
    void next();
    void prev();
    String getState();
}
