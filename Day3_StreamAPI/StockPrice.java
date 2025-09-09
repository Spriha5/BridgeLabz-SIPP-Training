package Day3_StreamAPI;
import java.util.*;
public class StockPrice {

	    public static void main(String[] args) {
	        List<Double> stockPrices = Arrays.asList(101.5, 102.3, 99.8, 100.6, 103.2);

	        System.out.println("Live Stock Prices:");
	        stockPrices.forEach(price -> System.out.println("Price: " + price));
	    }
	}



