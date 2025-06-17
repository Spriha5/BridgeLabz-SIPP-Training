import java.util.*;
public class canvote{
  public static void main(String[] args) {
     Scanner sc=new Scanner(System.in);
     int n=10;
     int[] arr=new int[n];

     for(int i=0;i<10;i++)
     {
        arr[i]=sc.nextInt();
     }

    for(int i=0;i<10;i++)
    {
        if(arr[i]<18)
        {
            System.out.println("Age at index"+arr[i]+"can not vote");
        }
        else if(arr[i]>=18)
        {
          System.out.println("Age at index"+arr[i]+"  can vote");  
        }

        else{
            System.out.println("not valid");
        }
        sc.close();
    }

  }
}