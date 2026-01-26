package strategy;

public class CreditCardPayment implements Payment {
    @Override
    public double pay(double amount) {
        return amount;
    }
}
