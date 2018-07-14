package j_12;

import java.util.Locale;
import java.util.Scanner;

public class Demo {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        input.useLocale(Locale.US);

        System.out.println("podaj liczbę");

        float number = input.nextFloat();

        if (number > 0 && number < 1) {
            System.out.println("liczba jest z przedziału <0, 1>");
        } else {
            System.out.println("liczba NIE jest z przedizału <0, 1>");
        }
    }
}
