package strategy.decorator;

import strategy.Payment;

public class ProcessingFeeDecorator extends PaymentDecorator {
    public ProcessingFeeDecorator(Payment payment) {
        super(payment);
    }

    @Override
    public double pay(double amount) {
        return payment.pay(amount) + 10;
    }
}
