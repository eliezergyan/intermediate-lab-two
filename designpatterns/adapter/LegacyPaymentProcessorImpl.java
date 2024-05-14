package designpatterns.adapter;

public class LegacyPaymentProcessorImpl implements LegacyPaymentProcessor{
    @Override
    public boolean processPaymentLegacy(String cardNumber, String cardExpiry, String cardCVV){
        System.out.println("Processing payment with legacy API...");
        return true;
    }
}
