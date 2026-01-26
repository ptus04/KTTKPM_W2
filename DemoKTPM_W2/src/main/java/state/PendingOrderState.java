package state;

import model.Order;

public class PendingOrderState extends OrderState {
    @Override
    public void ship(Order order) {
        order.setState(new DeliveredOrderState());
    }

    @Override
    public void cancel(Order order) {
        order.setState(new CancelledOrderState());
    }
}
