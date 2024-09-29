import java.io.*;
import java.util.Scanner;

public class FileHandling {
    public static void main(String[] args) {
        FileManager manager = new FileManager(); 
        String data = manager.read("some.txt");
        System.out.println(data);
        data = data.toUpperCase();
        manager.write("new.txt", data);
    }
}
class FileManager {
    public String read(String filename){
        try {
            // open file
            Scanner reader = new Scanner(new File(filename));   
            try {
                // To process  file
                String str = "";
                while (reader.hasNextLine()) {
                    str += reader.nextLine() + "\n";
                }
                return str;
            } finally {
                // close file
                reader.close();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }


    public void write(String filename, String data){
        try {
            FileWriter writer = new FileWriter(filename);  //creating a file writer and call your file filename
            try {
                // processing
                writer.write(data);
            }finally {
                writer.close();
            }
        } catch (IOException e) {

        }
    }

}
