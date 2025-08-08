package Day4_Exceptions;
import java.io.*;


public class checkException{
    public static void main(String[] args) {
        String fileName = "data.txt"; 

        try {
         
            FileReader fr = new FileReader(fileName);
            BufferedReader br = new BufferedReader(fr);

            System.out.println("File found!");

          
            String line;
            while ((line = br.readLine()) != null) {
                System.out.println(line);
            }

            br.close();
            fr.close();

        } catch (IOException e) {
            System.out.println("File not found,make sure file exist");
        }
    }
}


