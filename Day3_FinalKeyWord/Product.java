package Day3_FinalKeyWord;

public class Product {
	    static double discount = 10.0;
	    private String productName;
	    private double price;
	    private int quantity;
	    private final int PRODUCTID;

	    public Product(String productName, double price, int quantity, int PRODUCTID ) {
	        this.productName = productName;
	        this.price = price;
	        this.quantity = quantity;
	        this.PRODUCTID = PRODUCTID ;
	    }

	    public static void updateDiscount(double newDiscount) {
	        discount = newDiscount;
	    }

	    public void displayProductDetails() {
	        if (this instanceof Product) {
	            System.out.println("Product ID: " + PRODUCTID);
	            System.out.println("Product Name: " + productName);
	            System.out.println("Price:" + price);
	            System.out.println("Quantity: " + quantity);
	            System.out.println("Discount: " + discount + "%");
	        } else {
	            System.out.println("Invalid product object.");
	        }
	    }

	    public static void main(String[] args) {
	        Product p1 = new Product("Laptop", 65000.0, 1, 101);
	        Product p2 = new Product("Headphones", 2500.0, 2, 102);

	        p1.displayProductDetails();
	        System.out.println();
	        p2.displayProductDetails();
	        System.out.println();

	        updateDiscount(15.0);
	        System.out.println("Discount updated.\n");

	        p1.displayProductDetails();
	        System.out.println();
	        p2.displayProductDetails();
	    }


}
