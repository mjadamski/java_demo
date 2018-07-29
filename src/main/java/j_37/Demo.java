package j_37;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Demo {
    public static void main(String[] args) throws FileNotFoundException {

        File file = new File("books.txt");
        Scanner scanner = new Scanner(file);

        scanner.useDelimiter(",");

        Book temp;

        while (scanner.hasNextLine()) {

            temp = new Book();
            temp.setNazwa(scanner.next());
            temp.setAutor(scanner.next());
            temp.setRokWydania(Integer.parseInt(scanner.next().trim()));

            System.out.println(temp);

        }

        scanner.close();


    }
}
