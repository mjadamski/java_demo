package scrachbook.exercises;

import java.io.FileWriter;
import java.io.IOException;

public class DemoZapisWriter {
    public static void main(String[] args) throws IOException {

        FileWriter fileWriter = new FileWriter("plik_2.txt", true);

        fileWriter.append("kolejna lynia\n");
        fileWriter.close();

    }
}
