package strategy.decorator;

import strategy.Payment;

public abstract class PaymentDecorator implements Payment {
    protected  Payment payment;

    protected PaymentDecorator(Payment payment) {
        this.payment = payment;
    }
}
