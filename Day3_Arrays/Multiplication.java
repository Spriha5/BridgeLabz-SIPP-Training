import java.util.*;
public class Multiplication {
    public static void main(String[] args) {


    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();

    int[] arr=new int[4];
    int j=0;
    for(int i=6;i<=9;i++)
    {
       arr[j]=i*n;
       j++;
    }

     System.out.print(Arrays.toString(arr));
    }
    
}
