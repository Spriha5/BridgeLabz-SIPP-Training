import java.util.*;
public  class FizzBuzz{
public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();

    if(n<0) System.out.println("enter positive num");
     String[] arr=new String[n+15];

     for(int i=0;i<=n;i++)
     {
        if(i%3==0 && i!=0)
        {
            arr[i]="Fizz";
        }
        else if(i%5==0 && i!=0)
        {
            arr[i]="Buzz";
        }
        else if(i%5==0 && i%3==0 && i!=0)
        {
            arr[i]="FizzBuzz";
        }
        else {
            arr[i]= String.valueOf(i);
        }
     }

    for(int i=0;i<=n;i++)
    {
        System.out.println("pos"+i+"="+arr[i]);
    }
    sc.close();
}
}

    
