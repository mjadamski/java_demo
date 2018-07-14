package j_16;

import java.util.Locale;
import java.util.Scanner;

public class Demo {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        input.useLocale(Locale.US);

        System.out.println("wpisz tekst");
        String usrVar = input.nextLine();

        System.out.println("wpisz liczbe, co ile krokow");
        int krok = input.nextInt();

        for (int i = 0; i < usrVar.toCharArray().length; i++) {

            if ( i % krok == 0) {

                System.out.println(usrVar.toCharArray()[i]);

            }

        }

    }
}
