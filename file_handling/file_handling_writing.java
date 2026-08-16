package file_handling;

import java.io.File;
import java.io.FileWriter;

public class file_handling_writing {
    public static void main(String[] args) {
        try {
            File f = new File("file_handling/example.txt");
            FileWriter fw = new FileWriter(f);
            fw.write("KIRUBASHANKAR G");
            fw.close();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
