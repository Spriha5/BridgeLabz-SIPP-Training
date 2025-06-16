import java.util.Scanner;
public class Avg_od_three_num {
    public static void main(String[] args) {
      {
        Scanner sc = new Scanner(System.in);

        System.out.print("first number: ");
        double num1 = sc.nextDouble();

        System.out.print("second number: ");
        double num2 = sc.nextDouble();

        System.out.print("third number: ");
        double num3 = sc.nextDouble();

        double average = (num1 + num2 + num3) / 3;

        System.out.println("Average = " + average);
        sc.close();
    }   
    }
    
}
