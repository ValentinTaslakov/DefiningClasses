package StreamsFilesAndDirectories;

import java.io.*;
import java.util.Scanner;

public class WriteEveryThirdLine {
    public static void main(String[] args) throws IOException {
        String path = "input.txt";
        FileInputStream inputStream = new FileInputStream(path);
        InputStreamReader inputStreamReader = new InputStreamReader(inputStream);
        BufferedReader reader = new BufferedReader(inputStreamReader);


        FileOutputStream outputStream = new FileOutputStream(
                "C:\\Users\\35988\\Desktop\\Java Advanced\\" +
                        "04.Streams-Files-and-Directories\\" +
                        "04. Java-Advanced-Files-and-Streams-Lab-Resources\\" +
                        "05.WriteEveryThirdLineOutput.txt");
        BufferedWriter print = new BufferedWriter(new PrintWriter("C:\\Users\\35988\\Desktop\\Java Advanced\\" +
                "04.Streams-Files-and-Directories\\" +
                "04. Java-Advanced-Files-and-Streams-Lab-Resources\\" +
                "05.WriteEveryThirdLineOutput.txt"));

        String line = reader.readLine();
        int count = 1;
        while (line != null) {
            if (count % 3 == 0) {
                print.write(line + System.lineSeparator());

            }
            line = reader.readLine();
            count++;
        }
        print.flush();

    }
}