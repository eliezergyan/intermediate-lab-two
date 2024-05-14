package designpatterns.facade;

import java.util.List;

public class OrderFacade {
    private InventorySystem inventorySystem;
    private PaymentSystem paymentSystem;
    private ShippingSystem shippingSystem;

    public OrderFacade(){
        this.inventorySystem = new InventorySystem();
        this.paymentSystem = new PaymentSystem();
        this.shippingSystem = new ShippingSystem();
    }

    public boolean placeOrder(List<String> items, double amount, String cardNumber, String address){
        boolean inventoryCheck = inventorySystem.checkInventory(items);
        if(!inventoryCheck){
            System.out.println("Items not available in inventory.");
            return false;
        }

        boolean paymentStatus = paymentSystem.processPayment(amount, cardNumber);
        if(!paymentStatus){
            System.out.println("Payment failed. Order not placed.");
            return false;
        }

        inventorySystem.updateInventory(items);
        shippingSystem.shipItems(items, address);
        System.out.println("Order placed successfully.");
        return true;
    }
}
