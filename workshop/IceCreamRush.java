package workshop;
import java.util.*; 

public class IceCreamRush {
	
	
	
    public static void bubbleSort(Flavour[] arr) {
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j].sales < arr[j + 1].sales) {
                    Flavour temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }
    
    
    
 
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] flavorNames = {
            "Va", "C", "S", "M",
            "Co", "L", "P", "Mango"
        };

    
        Flavour[] flavours = new Flavour[8];

       
        System.out.println("Enter weekly flavourwise");
        for (int i = 0; i < 8; i++) {
            System.out.print("Sales for " + flavorNames[i] + ": ");
            int sales = sc.nextInt();
            flavours[i] = new Flavour(flavorNames[i], sales);  
        }

        bubbleSort(flavours);

      
        System.out.println("Sorted Ice Cream Sales");
        for (Flavour flavor : flavours) {
            System.out.print(flavor.name + " : " + flavor.sales+" , " );
        }

    }


}



//public class IceCreamRush {
//public int[] sort(int[] sorted) 
//	{
//		 int n = sorted.length;
//	        for (int i = 0; i < n - 1; i++)
//	        {
//	            for (int j = 0; j < n - 1 - i; j++)
//	            {
//	                if (sorted[j] > sorted[j + 1]) {
//	                    int temp = sorted[j];
//	                    sorted[j] = sorted[j + 1];
//	                    sorted[j + 1] = temp;
//	                }
//	            }
//	       }
//		return sorted;
//	
//	}
//	public void display(int[] sortedarr) {
//		for(int i = 0;i<8;i++)
//		{
//			System.out.print(sortedarr[i]+" ");
//		}
//		
//	}
//	public static void main(String[] args){
//		Scanner sc=new Scanner(System.in);
//		System.out.print("Enter the no of time  happen");
//		int[] arr=new int[8];
//		for(int i=0;i<8;i++)
//		{
//			arr[i]=sc.nextInt();		
//	     }
//	
//	   IceCreamRush obj=new IceCreamRush();
//	   int[] arr1=obj.sort(arr);
//	   obj.display(arr1);
//	   
//	}
//	
//	











