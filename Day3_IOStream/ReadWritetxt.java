package Day3_IOStream;


import java.io.*;

public class ReadWritetxt {
    public static void main(String[] args) {
        try {
           
            FileInputStream fin = new FileInputStream("source.txt");  
            FileOutputStream fout = new FileOutputStream("destination.txt"); 

            // Step 2: Read and write byte by byte
            int data;
            while ((data = fin.read()) != -1) {  // -1 means end of file
                fout.write(data);
            }

            // Step 3: Close both files
            fin.close();
            fout.close();

            System.out.println("File copied successfully!");
        }
        catch (FileNotFoundException e) {
            System.out.println("Source file not found!");
        }
        catch (IOException e) {
            System.out.println("Error reading or writing file.");
        }
    }
}
