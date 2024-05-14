package designpatterns.adapter;

public interface LegacyPaymentProcessor {
    boolean processPaymentLegacy(String cardNumber, String cardExpiry, String cardCVV);
}
