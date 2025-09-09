package Day1_LambdaExpression;
interface LightBehavior {
    void activate();
}
public class SmartHome {
    public static void main(String[] args) {
	        
	      
	        LightBehavior motion = () -> System.out.println("Motion → Lights ON (soft white).");
	        LightBehavior night = () -> System.out.println("Night → Lights dimmed to 30%.");
	        LightBehavior morning = () -> System.out.println("Morning → Bright daylight mode.");
	        LightBehavior voice = () -> System.out.println("Voice → lights ON!");

	        activate(motion);
	        activate(night);
	        activate(morning);
	        activate(voice);
	    }

	  
	    public static void activate(LightBehavior behavior) {
	        behavior.activate();
	    }
	}



