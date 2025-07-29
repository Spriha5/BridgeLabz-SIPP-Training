package Day1_Generics;

public class WareHouse {
    public static void main(String[] args) {
        Storage<WarehouseItem> storage = new Storage<>();

        storage.addItem(new Electronics("Laptop", 50000));
        storage.addItem(new Groceries("Wheat", 1800));
        storage.addItem(new Furniture("Sofa", 15000));
        storage.addItem(new Electronics("Smartphone", 30000));
        storage.addItem(new Groceries("Milk", 60));
        storage.addItem(new Furniture("Table", 4500));

        storage.displayItems();
    }
}
