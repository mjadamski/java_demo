package scrachbook.exercises;

import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class DemoZapisPrintWriter {
    public static void main(String[] args) throws FileNotFoundException {

        PrintWriter printWriter = new PrintWriter("plik_2.txt");


        printWriter.println("Text przykładowy 2");
        printWriter.close();


    }
}
