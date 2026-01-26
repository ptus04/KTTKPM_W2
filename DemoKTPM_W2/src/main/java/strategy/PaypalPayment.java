package strategy;

public class PaypalPayment implements Payment {
    @Override
    public double pay(double amount) {
        return amount;
    }
}
