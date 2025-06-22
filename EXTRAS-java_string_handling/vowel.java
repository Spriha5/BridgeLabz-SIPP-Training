import java.util.*;
public class vowel {
public  static void main(String[] args)
{
	Scanner sc=new Scanner(System.in);
	String input=sc.nextLine();
	int vowel=0,consonants=0;
	input=input.toLowerCase();
	
	for(char ch:input.toCharArray())
	{
		if(Character.isLetter(ch))
		{
			if("aeiou".indexOf(ch)!=-1) vowel++;
			else consonants++;
		}
	}
	System.out.println("Vowel:"+vowel);
	System.out.print("consonants:"+consonants);
	sc.close();
}
}
