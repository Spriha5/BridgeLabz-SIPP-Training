import java.util.*;
public class SpringSeason{
public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
    int month=sc.nextInt();
    int day=sc.nextInt();
    if(month==3&& (day>19&&day<32)||month==4&& (day>0&&day<31)||month==5&& (day>0&&day<32)||month==6&& (day>0&&day<21))
    {
        System.out.println("Its a Spring Season");
    }
    else{
        System.out.println("Not a Spring Season");
    }
    sc.close();
}
}