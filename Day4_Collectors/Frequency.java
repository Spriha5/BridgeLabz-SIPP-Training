package Day4_Collectors;
import java.util.*;
import java.util.stream.*;
public class Frequency {
	

	    public static void main(String[] args) {
	        String paragraph = "Java is simple and Java is powerful and Java is popular";

	        String[] words = paragraph.split("\\s+");

	        
	        Map<String, Integer> wordCount = Arrays.stream(words)
	            .collect(Collectors.toMap(
	                word -> word,    
	                word -> 1,        
	                Integer::sum      
	            ));

	   
	        wordCount.forEach((word, count) ->
	            System.out.println(word + " -> " + count)
	        );
	    }
	}

