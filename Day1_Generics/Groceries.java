package Day1_Generics;

class Groceries extends WarehouseItem {
    public Groceries(String name, double price) {
        super(name, price);
    }

    @Override
    public String getItemType() {
        return "Groceries";
    }
}