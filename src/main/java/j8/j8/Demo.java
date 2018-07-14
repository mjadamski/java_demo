package j8;

import java.util.Locale;
import java.util.Scanner;

/**
 * Created by emawary on 2018-06-14.
 */
public class Demo {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        input.useLocale(Locale.US);
        System.out.println("Podaj A: ");
        double a = input.nextDouble();
        System.out.println("Podaj B: ");
        double b = input.nextDouble();
        System.out.println("Podaj c: ");
        double c = input.nextDouble();

        System.out.println("srednia arytmetyczna to" + (a+b+c)/3);

    }

}
