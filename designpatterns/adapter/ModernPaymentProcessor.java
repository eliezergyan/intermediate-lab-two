package designpatterns.adapter;

public interface ModernPaymentProcessor {
    boolean processPayment(double amount, String cardNumber, String cardExpiry, String cardCVV);
}
