package strategy.decorator;

import strategy.Payment;

public class DiscountDecorator extends PaymentDecorator {
    public DiscountDecorator(Payment payment) {
        super(payment);
    }

    @Override
    public double pay(double amount) {
        return payment.pay(amount) - 15;
    }
}
