package Day1_LambdaExpression;
import java.util.*;
public class UpperCase {
	
	    public static void main(String[] args) {
	        List<String> employees = Arrays.asList("Amit", "Spriha", "Neha", "Ravi");

	        System.out.println("Employee names in UPPERCASE:");
	        employees.stream()
	                 .map(String::toUpperCase)  
	                 .forEach(System.out::println);
	    }
	}


