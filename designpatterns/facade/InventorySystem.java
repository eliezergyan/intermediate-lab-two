package designpatterns.facade;

import java.util.List;

public class InventorySystem {
    public boolean checkInventory(List<String> items){
        System.out.println("Checking inventory for items: " + items);
        // Add some logic here
        return true;
    }

    public void updateInventory(List<String> items){
        // Update inventory after order is placed
        System.out.println("Updating inventory for items: " + items);
    }
}
