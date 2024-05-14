package designpatterns.facade;

import java.util.List;

public class InventorySystem {
    public boolean checkInventory(List<String> items){
        // implement some logic here later
        System.out.println("Checking inventory for items: " + items);
        return true;
    }

    public void updateInventory(List<String> items){
        // implement some logic here later
        System.out.println("Updating inventory for items: " + items);
    }
}
