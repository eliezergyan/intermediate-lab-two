package designpatterns.facade;

public class PaymentSystem {
    public boolean processPayment(double amount, String cardNumber){
        System.out.println("Processing payment of GHS" + amount + " with card number " + cardNumber);
        // Implement some logic here
        return true;
    }
}
