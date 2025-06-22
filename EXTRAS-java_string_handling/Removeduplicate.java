import java.util.*;
public class Removeduplicate {
public static void main(String[] args)
{
	Scanner sc=new Scanner(System.in);
	String input=sc.next();
	StringBuilder result=new StringBuilder();
	  for (char ch : input.toCharArray()) {
          if (result.indexOf(String.valueOf(ch)) == -1) {
              result.append(ch);
          }
      }

      System.out.println(result);
      sc.close();

}

}
