
import java.util.*;
public class comparenaturalnumsum {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
	int n=sc.nextInt();
	int sum1=0;
	int sum2=0;
	for(int i=1;i<n;i++)
	{
		sum1+=i;
	}
	System.out.print(sum1);
	
	sum2=(n*(n-1)/2);
	System.out.print(sum2);
	 if(sum1==sum2)
	 {
		 System.out.println("yes equal");
		 System.out.print(sum1); 
	 }
	}
   sc.nextInt();
}


