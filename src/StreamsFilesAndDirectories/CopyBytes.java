package StreamsFilesAndDirectories;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintStream;
import java.util.Set;

public class CopyBytes {
    public static void main(String[] args) throws IOException {
        String path = "input.txt";
        FileInputStream inputStream = new FileInputStream(path);

        FileOutputStream outputStream = new FileOutputStream(
                "C:\\Users\\35988\\Desktop\\Java Advanced\\" +
                        "04.Streams-Files-and-Directories\\" +
                        "04. Java-Advanced-Files-and-Streams-Lab-Resources\\" +
                        "03.CopyBytesOutput.txt");
        PrintStream print = new PrintStream(outputStream);

        int value = inputStream.read();

        while (value != -1) {
            if (value != 10 && value != 32) {
                print.print(value);
            }else {
                print.print((char) value);
            }

            value = inputStream.read();
        }
        outputStream.close();
    }
}
