import java.util.*;
public class Outofbound{
  public static void main(String[] args) {
     Scanner sc=new Scanner(System.in);
     int n=9;
     int[] arr=new int[n];

     for(int i=0;i<9;i++)
     {
        arr[i]=sc.nextInt();
     }

     System.out.println(arr[9]);
     sc.close();
    }
}