package designpatterns.adapter;

public class LegacyToModernAdapter implements ModernPaymentProcessor{
    private final LegacyPaymentProcessor legacyPaymentProcessor;

    public LegacyToModernAdapter(LegacyPaymentProcessor legacyPaymentProcessor) {
        this.legacyPaymentProcessor = legacyPaymentProcessor;
    }

    @Override
    public boolean processPayment(double amount, String cardNumber, String cardExpiry, String cardCVV){
        return legacyPaymentProcessor.processPaymentLegacy(cardNumber, cardExpiry, cardCVV);
    }
}
