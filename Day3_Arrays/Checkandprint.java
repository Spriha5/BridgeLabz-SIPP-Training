import java.util.*;
public class Checkandprint {
public static void main(String[] args)
{
	Scanner sc=new Scanner(System.in);
	int[] arr=new int[5];
	for(int i=0;i<5;i++)
	{
		arr[i]=sc.nextInt();
	}
	 for(int i=0;i<5;i++)
	 {
	   if(arr[i]>0)
	   {
		  if(arr[i]%2==0)
		  {
			  System.out.println(arr[i]+" is even");
		  }
		  else {
			  System.out.println(arr[i]+" is odd");
		  }
	   }
	   
	   else if(arr[i]==0)
	   {
			  System.out.println(arr[i]+" is Zero");
	   }
	   
	   else {
		   System.out.println(arr[i]+" is negative");
	   }
	 }
	 sc.close();
}
}
