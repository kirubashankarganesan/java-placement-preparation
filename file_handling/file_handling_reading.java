package file_handling;

import java.io.File;
import java.util.Scanner;

public class file_handling_reading {
    public static void main(String[] args) {
        try{
            File f=new File("file_handling/example.txt");
            Scanner reader=new Scanner(f);
            while (reader.hasNextLine()) {
                System.out.println(reader.nextLine());
            }
            reader.close();
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
        
    }
}
