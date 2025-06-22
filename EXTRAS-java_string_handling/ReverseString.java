import java.util.*;
public class ReverseString {
public static void main(String[] args)
{
	Scanner sc=new Scanner(System.in);
	String input=sc.next();
	String reverse="";
	 for(int i=input.length()-1;i>=0;i--)
	 {
		reverse+=input.charAt(i); 
	 }
	 
	 System.out.print("reversed--> "+reverse);
	 sc.close();
}
}
