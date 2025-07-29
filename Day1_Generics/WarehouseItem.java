package Day1_Generics;

public class WarehouseItem {
	private String name;
	private double price;
	
	
	public WarehouseItem(String name, double price) {
	
		this.name = name;
		this.price = price;
	}


	public String getName() {
		return name;
	}




	public double getPrice() {
		return price;
	}


	
	  public String getItemType() {
		return null;
	}
	
	
	  public void displayDetails() {
	        System.out.println(getItemType() + ": " + name + " | ₹" + price);
	    }
	
	
	

}
