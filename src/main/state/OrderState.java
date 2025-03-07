package main.state;

public interface OrderState {
    void next();
    void prev();
    String getState();
}
