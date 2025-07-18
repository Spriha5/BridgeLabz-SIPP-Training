package workshop;
import java.lang.reflect.Array;
import java.util.*;
public class DuplicateInArray 
{
 public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the array size");
        int n = sc.nextInt();
        int[] arr = new int[n];
        
        System.out.println("Enter the array elements");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        
        freq(arr,n);
        distinct(arr, n);
          System.out.print(dup(arr,n));
        
    }

    public  static void distinct(int[] arr, int n) {
        ArrayList<Integer> ar = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            int count = 0;

           
            for (int j = 0; j < n; j++) {
                if (arr[i] == arr[j]) {
                    count++;
                }
            };

          
            if (count == 1 && !ar.contains(arr[i])) {
                ar.add(arr[i]);
            }
        }

        for (int i = 0; i < ar.size(); i++) {
            System.out.print(ar.get(i) + " ");
        }
       
    }
    

	public static int  dup(int[] arr,int n) 
	 {
        ArrayList<Integer> ar = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            int count = 0;

           
            for (int j = 0; j < n; j++) {
                if (arr[i] == arr[j]) {
                    count++;
                }
            };

          
            if (count>1 && !ar.contains(arr[i])) {
                ar.add(arr[i]);
            }
        }

        return ar.size();
       }
       public static void  freq(int[] arr,int n)
	{
		int m=2;
		int[][] frequ=new int[n][m];
		Arrays.sort(arr);
		int i=0;
		int j=0;
		 while (i < n) {
	            int count = 1;
	            while (i < n - 1 && arr[i] == arr[i + 1]) {
	                count++;
	                i++;
	            }
	            frequ[j][0] = arr[i];
	            frequ[j][1] = count;
	            j++;
	            i++;
	        }

	     
	        for (int k = 0; k < j; k++) {
	            System.out.println(frequ[k][0] + " " + frequ[k][1]);
	        }
	    }
		
	
	}
	


