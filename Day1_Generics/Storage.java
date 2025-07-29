package Day1_Generics;
import java.util.*;
class Storage<T extends WarehouseItem> {
    private List<T> items = new ArrayList<>();

    public void addItem(T item) {
        items.add(item);
    }

    public void displayItems() {
        if (items.isEmpty()) {
            System.out.println("Storage is empty.");
            return;
        }

        System.out.println("=== Stored Items ===");
        for (WarehouseItem item : items) { 
            item.displayDetails();
        }
    }
}
