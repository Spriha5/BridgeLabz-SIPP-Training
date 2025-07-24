package workshop;

import java.util.List;

public class InvoiceGenerator {
	
	float totalFare;
	float totalRide;
	float averageFare;
	
	public void invoice(List<Float> rides)
	{
		totalFare=0.0f;
		totalRide=rides.size();
		
		
		   for(int i=0;i<rides.size();i++)
		         {
		        	 totalFare+=rides.get(i);
	        }
		   
		   averageFare=totalFare/totalRide;
	}
	
	
	public void diplay()
	{
		 System.out.println("Total Fare = " + totalFare);
	        System.out.println("Total Number of Rides = " + totalRide);
	        System.out.println("Average Fare per Ride = " + averageFare);
	}
	
	
	

}
