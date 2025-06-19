
import java.util.Scanner;

public class checkNaturalnum {
	 public static void main(String[] args)
	 {
		Scanner sc=new Scanner(System.in);
		int n =sc.nextInt();
		int sum=0;
		 if(n>0)
		 {
			 sum=(n*(n+1))/2;
			 System.out.print("The sum of "+ n +" natural num is "+sum);
		 }
		
		 else
		 {
			 System.out.print("The number is not natural number");
		 }
		 sc.close();
	 }

}
