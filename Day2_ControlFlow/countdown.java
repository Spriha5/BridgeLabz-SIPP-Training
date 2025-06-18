import java.util.*;
public class countdown {
  public static void main(String[] args) {
      Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    for(int i=n;i>0;i--)
    {
        System.out.println("Counter"+i);
    }
    sc.close();
  }
}
