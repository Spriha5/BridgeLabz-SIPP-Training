package workshop;
import java.util.*;
public class Ride {
	
	

		float distance;
		float time;
	
	     static final int NORMAL_MINIMUM_COST = 5;
	     static final int NORMAL_COST_PER_KM = 10;
	     static final int NORMAL_COST_PER_MIN = 1;

	  
	    static final int PREMIUM_MINIMUM_COST = 20;
	    static final int PREMIUM_COST_PER_KM = 15;
	    static final int PREMIUM_COST_PER_MIN = 2;

       
		
		
		Ride(float distance,float time)
		{
			this.distance=distance;
			this.time=time;
			
		}
		

	    public  float CalculateFare(String type) {
	    	 int minimum=0;
	         int costkm=0;
	         int costmin=0;
	         if (type.equalsIgnoreCase("NORMAL")) {
	             minimum = NORMAL_MINIMUM_COST;
	             costkm = NORMAL_COST_PER_KM;
	             costmin = NORMAL_COST_PER_MIN;
	         } else if (type.equalsIgnoreCase("PREMIUM")) {
	             minimum = PREMIUM_MINIMUM_COST;
	             costkm = PREMIUM_COST_PER_KM;
	             costmin = PREMIUM_COST_PER_MIN;
	         }else {
	            System.out.println("Invalid ride type!");
	            return 0;
	        } 
	        
	        
	    	float totalFare=distance * costkm+ time * costmin;
	    	return (totalFare<minimum)?minimum:totalFare;
	    }
	    
	    
//	    public static void Invoice(List<Float> rides)
//	    {
////	    	System.out.print(rides.get(0));
//	    	float total=0.0f;
//	         for(int i=0;i<rides.size();i++)
//	         {
//	        	 total+=rides.get(i);
//        }
//	         System.out.println("Total fare = "+total);
//	         System.out.println("Total number of rides=" +rides.size());
//	         System.out.print("Average Fare Per ride = "+total/rides.size());
//   	
//	    }

	    public static void main(String[] args) {
//	        Ride obj= new Ride(10, 2);
//	        Ride obj1= new Ride(10, 2); 
//	        Ride obj2= new Ride(10, 2); 
	        
	        Scanner sc=new Scanner(System.in);
	        System.out.println("Enter no of rides");
	        int num=sc.nextInt();
	        List<Float> rides=new ArrayList<>();
	        for(int i=0;i<num;i++)
	        {
	        	System.out.println("Enter distance and time and type for your ride   "+(i+1));
	        	float dis=sc.nextFloat();
	        	float time=sc.nextFloat();
	        	String type=sc.next();	        	
	        	Ride ride=new Ride(dis,time);
	        	rides.add(ride.CalculateFare(type));
	        	
	        	
	        	
        }
	        InvoiceGenerator invoice = new InvoiceGenerator();
	        
	        invoice.invoice(rides);  // Calculates totals
	        invoice.diplay();  
	        
	        
	        
//	        float[] fare = {obj.calculateFare("PREMIUM"),obj1.calculateFare("NORMAL"),obj.calculateFare("PREMIUM")};
//	        float total=0.0f;
//	         for(int i=0;i<fare.length;i++)
//	         {
//	        	 total+=fare[i];
//	         }
//	         
//	         System.out.println("Total fare = "+total);
//	         System.out.println("Total number of rides=" +fare.length);
//	         System.out.print("Average Fare Per ride = "+(total/fare.length));
//	        System.out.println("Fare" + fare);
	    }



}
