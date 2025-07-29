package Day1_Generics;

class Electronics extends WarehouseItem {
    public Electronics(String name, double price) {
        super(name, price);
    }

    @Override
    public String getItemType() {
        return "Electronics";
    }
}