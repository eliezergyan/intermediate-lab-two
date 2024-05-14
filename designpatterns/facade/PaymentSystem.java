package designpatterns.facade;

public class PaymentSystem {
    public boolean processPayment(double amount, String cardNumber){
        // Implement some logic here later
        System.out.println("Processing payment of GHS" + amount + " with card number " + cardNumber);
        return true;
    }
}
