package workshop;
import java.util.*;

	
	
	interface NavigationManager
	{
		void open(String url);
		void back();
		void forward();
	}
	
  class Navigation implements NavigationManager{
		
		private Stack<String> forward=new Stack<>();
		private Stack<String> backward=new Stack<>();
		private String current;

		@Override
		public void open(String url) {
			if(current!=null)
			{
				backward.push(current);
			}
			current=url;
		}

		@Override
		public void back() {
			if(!backward.isEmpty())
			{
				forward.push(current);
				current=backward.pop();
				
			}
			}

		@Override
		public void forward() {
			if(!forward.isEmpty())
			{
				backward.push(current);
				current=forward.pop();
				
			}
			
		}
		
		void display()
		{ 
			System.out.println("forward sites:");
			
			forward.forEach(x -> {
			    System.out.println(x);
			});
			
			System.out.println("backward sites:");
			backward.forEach(x -> {
			    System.out.println(x);
			});
           System.out.println("current site---->"+current);
           System.out.println();
           
           
		}

	
	public static void main(String[] args)
	{
	  Navigation obj=new Navigation();
	  obj.open("google");
	  obj.open("yahoo");
	  obj.open("edge");
	  
	  obj.display();
	
	  
    obj.back();
    System.out.println("navigating back");
	  obj.display();

	  
	  obj.forward();
	  System.out.println("navigating forward");
	  obj.display();
	  
	}
 
}





















