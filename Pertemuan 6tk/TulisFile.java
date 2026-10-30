import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class TulisFile {
    public static void main(String[] args) {
        FileOutputStream fileOutputStream = null;

        String barisData = "Baris 1: Algoritma dan Pemrograman - 4 SKS"
        ;
        try{
            fileOutputStream = new FileOutputStream("tess.TXT");
        } catch(FileNotFoundException e){
            System.out.println("File Tidak di temukan");
        }
        try{
            for( int i = 0; i < barisData.length(); i++){
                fileOutputStream.write((int)barisData.charAt(i));
            }
        }catch(IOException e){
            System.out.println(e.getMessage());
        }
        try{
            fileOutputStream.close();
        }catch(IOException e){

        }
    }
}