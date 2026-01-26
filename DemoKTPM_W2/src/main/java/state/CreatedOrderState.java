package state;

import model.Order;

public class CreatedOrderState extends OrderState {
    @Override
    public void proceed(Order order) {
        order.setState(new PendingOrderState());
    }

    @Override
    public void cancel(Order order) {
        order.setState(new CancelledOrderState());
    }
}
