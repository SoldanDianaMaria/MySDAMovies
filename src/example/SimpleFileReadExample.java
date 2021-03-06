package example;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

/**
 * @author Diana Soldan
 * @date : 5/11/2019
 */
public class SimpleFileReadExample {

    public static void main(String[] args) {
        String absolutePath = "D:\\JavaWorkspace\\MySDAMovies\\movies.txt";
        String relativePath = "movies.txt";

        File file = new File(relativePath);
        System.out.println(file.exists());
        System.out.println(file.getAbsolutePath());
        System.out.println(file.getPath());

        try {
            FileReader fileReader = new FileReader(file);
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            String line = bufferedReader.readLine();
            while (line != null) {
                System.out.println(line);
                line = bufferedReader.readLine();
            }
        } catch (Exception e) {
            e.printStackTrace();


        }
    }
}