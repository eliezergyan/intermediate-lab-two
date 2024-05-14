package designpatterns.facade;

import java.util.List;

public class Main {
    public static void main(String[] args){
        OrderFacade orderFacade = new OrderFacade();

        List<String> items = List.of("Toothpaste", "Cream", "Toothbrush");
        double amount = 100.0;
        String cardNumber = "CC-1234567890";
        String address = "123 SSNIT, Takoradi, Ghana";

        boolean orderPlaced = orderFacade.placeOrder(items, amount, cardNumber, address);
        System.out.println("Order placed: " + orderPlaced);
    }
}
