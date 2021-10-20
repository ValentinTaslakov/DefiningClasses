package StreamsFilesAndDirectories;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintStream;
import java.util.Scanner;

public class ExtractIntegers {
    public static void main(String[] args) throws IOException {
        String path = "input.txt";
        FileInputStream inputStream = new FileInputStream(path);
        Scanner scan = new Scanner(inputStream);

        FileOutputStream outputStream = new FileOutputStream(
                "C:\\Users\\35988\\Desktop\\Java Advanced\\" +
                        "04.Streams-Files-and-Directories\\" +
                "04. Java-Advanced-Files-and-Streams-Lab-Resources\\" +
                        "04.ExtractIntegersOutput.txt");
        PrintStream print = new PrintStream(outputStream);

        while (scan.hasNext()){
            if (scan.hasNextInt()){
                print.println(scan.nextInt());
            }
            scan.next();
        }

    }
}
