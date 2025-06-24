public class NullPointer {

    public static void generateException() {
        String text = null;  
     
        System.out.println("Length of text: " + text.length());
    }

    public static void handleException() {
        String text = null;  

        try {
            System.out.println("Length of text: " + text.length());
        } catch (NullPointerException e) {
            System.out.println("Caught NullPointerException: Cannot call method on a null object.");
        }
    }

    public static void main(String[] args) {
       
        System.out.println("Calling generateException (with exception):");
        try {
            generateException();
        } catch (NullPointerException e) {
            System.out.println("Exception caught in main: " + e.getMessage());
        }

        System.out.println("\nCalling handleException (handled internally):");
        
        handleException();
    }
}