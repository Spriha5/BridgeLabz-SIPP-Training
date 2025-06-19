import java.util.*;
public class factorialForloop {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int fac=1;	
		for(int i=n;i>0;i--)
		{
		 fac*=i;  	
		}
		System.out.print(fac);
		sc.close(); 
}


}
