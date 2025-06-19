import java.util.Scanner;

public class CanVote {
	 public static void main(String[] args)
	 {
		Scanner sc=new Scanner(System.in);
		int n =sc.nextInt();
		 if(n>=18)
		 {
			 System.out.print("The Person's age is "+ n +" and can vote");
		 }
		
		 else
		 {
			 System.out.print("The Person's age is "+ n +" and cannot vote");
		 }
		 sc.close();
	 }

}
