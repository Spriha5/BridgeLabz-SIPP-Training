import java.util.*;
public class PrintTable {
    public static void main(String[] args) {


    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();

    int[] arr=new int[10];
    int j=0;
    for(int i=1;i<=10;i++)
    {
       arr[j]=i*n;
       j++;
    }

     System.out.print(Arrays.toString(arr));
     sc.close();
    }
}
