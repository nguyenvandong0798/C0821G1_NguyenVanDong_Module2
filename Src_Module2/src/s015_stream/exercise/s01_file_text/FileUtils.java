package s015_stream.exercise.s01_file_text;


import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FileUtils {
    public static void main(String[] args) {
        File file = new File("src/utils/text.txt");
        if (file.exists()){
            try {
                file.createNewFile();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        try {
            FileInputStream fileInputStream = new FileInputStream(file);
            int word = fileInputStream.read();
            while (word != -1){
                System.out.println((char) word);
                word = fileInputStream.read();
            }
            fileInputStream.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
