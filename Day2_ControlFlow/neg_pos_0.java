
import java.util.*;
public class neg_pos_0 {
 public static void main(String[] args)
 {
	Scanner sc=new Scanner(System.in);
	int n =sc.nextInt();
	 if(n>0)
	 {
		 System.out.print("Positive");
	 }
	 else if(n==0)
	 {
		System.out.print("Zero"); 
	 }
	 else
	 {
		 System.out.print("Negative");
	 }
	 sc.close();
 }
}
