package scrachbook.exercises;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class DemoOdczyt {
    public static void main(String[] args) throws FileNotFoundException {

        File file = new File("plik.txt");
        Scanner input = new Scanner(file);

        String text = input.nextLine();
        System.out.println(text);

    }
}
