package StreamsFilesAndDirectories;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;
import java.util.Set;

public class WriteToFile {
    public static void main(String[] args)throws IOException {
        Scanner scan = new Scanner(System.in);

        String path = "input.txt";
        FileInputStream inputStream = new FileInputStream(path);
        String homeDir = System.getProperty("user.home");

        FileOutputStream outputStream = new FileOutputStream(homeDir +"\\"+ "out.txt");

        int value = inputStream.read();
        Set<Character> punctuation = Set.of(',','.','!','?');

        while (value!=-1){
            char current = (char) value;
            if (!punctuation.contains(current)) {

                outputStream.write(current);
            }
            value = inputStream.read();
        }
        outputStream.close();
    }
}
