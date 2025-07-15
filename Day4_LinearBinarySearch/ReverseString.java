package Day4_LinearBinarySearch;
import java.util.*;
public class ReverseString {

	public static String rever(StringBuilder str)
	{
		StringBuilder rev=str.reverse();
		String revv=rev.toString();
		return revv ;
		
	}
	
	public static void main(String[] args)
	{
		String str="Hello";
		StringBuilder str1=new StringBuilder();
		str1.append(str);
		System.out.print(rever(str1));
		
		
		
		
		
				}
}
