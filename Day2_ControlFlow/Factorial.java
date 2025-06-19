
import java.util.Scanner;

public class Factorial {
	 public static void main(String[] args)
	 {
		Scanner sc=new Scanner(System.in);
		int fact=1;
		int n =sc.nextInt();
		while(n!=0)
		{
			fact*=n;
			n--;
			
		}
		System.out.print(fact);
		
		sc.close();
	 }
}
