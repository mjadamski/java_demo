package j8;

import java.util.Locale;
import java.util.Scanner;

/**
 * Created by emawary on 2018-06-14.
 */
public class DemoScratchBook {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        input.useLocale(Locale.US);
        System.out.println("Podaj A: ");
        double a = input.nextDouble();
        System.out.println("Podaj B: ");
        double b = input.nextDouble();
        System.out.println("Podaj napis: ");
        input.nextLine();
        String s = input.nextLine();
        System.out.println(s);
        input.close();
        System.out.println("A + b = " + (a+b));

    }

}
