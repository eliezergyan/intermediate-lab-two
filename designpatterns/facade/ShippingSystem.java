package designpatterns.facade;

import java.util.List;

public class ShippingSystem {
    public void shipItems(List<String> items, String address){
        System.out.println("Shipping items: " + items + " to address: " + address);
    }
}
