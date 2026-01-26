package state;

import model.Order;

public abstract class OrderState {
    public void proceed(Order order) {
        throw new IllegalStateException("Operation not allowed");
    }

    public void ship(Order order) {
        throw new IllegalStateException("Operation not allowed");
    }

    public void cancel(Order order) {
        throw new IllegalStateException("Operation not allowed");
    }

    @Override
    public String toString() {
        return this.getClass().getSimpleName();
    }
}
