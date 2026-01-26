package model;

import state.CreatedOrderState;
import state.OrderState;

public class Order {
    private OrderState orderState;

    public Order() {
        this.orderState = new CreatedOrderState();
    }

    public String getState() {
        return orderState.toString();
    }

    public void setState(OrderState state) {
        orderState = state;
    }

    public void proceed() {
        orderState.proceed(this);
    }

    public void ship() {
        orderState.ship(this);
    }

    public void cancel() {
        orderState.cancel(this);
    }
}
