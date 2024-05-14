package designpatterns.adapter;

public class Main {
    public static void main(String[] args) {
        LegacyPaymentProcessor legacyPaymentProcessor = new LegacyPaymentProcessorImpl();
        ModernPaymentProcessor adapter = new LegacyToModernAdapter(legacyPaymentProcessor);

        boolean result = adapter.processPayment(100.0, "123456789", "12/25", "123");
        System.out.println("Payment processed successfully: " + result);
    }
}
