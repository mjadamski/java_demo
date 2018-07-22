package j_21;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Demo {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("podaj słowa - end - konczy program");

        List<String> strings = new ArrayList<String>();

        while (input.hasNextLine()) {

            String text = input.nextLine();

            if (text.equals("end")) {
                input.close();
                break;
            } else {
                strings.add(text);

            }
        }

        System.out.println(strings);
    }

}
