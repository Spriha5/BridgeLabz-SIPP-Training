package Day1_Generics;

public class Furniture extends WarehouseItem {
	   public Furniture(String name, double price) {
		super(name, price);
		
	}


	    @Override
	    public String getItemType() {
	        return "Furniture";
	    
}
}
