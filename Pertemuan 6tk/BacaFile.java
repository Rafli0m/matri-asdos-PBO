import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class BacaFile {
    
    public static void main(String[] args) {
        FileInputStream fileInputStream = null;
        int data;
        try {
            fileInputStream = new FileInputStream("data_mata_kuliah.txt");
        } catch (FileNotFoundException e) {
            System.out.println("File not found: " + e.getMessage());
        }
        try{
            while((data = fileInputStream.read()) != -1){
                System.out.print((char) data);
            }
            System.out.println("\nFile read successfully.");
        } catch (IOException e) {
            System.out.println("Error reading file: " + e.getMessage());
        }
        try{
            fileInputStream.close();
        } catch (IOException e) {
            System.out.println("Error closing file: " + e.getMessage());
        }
    }
}