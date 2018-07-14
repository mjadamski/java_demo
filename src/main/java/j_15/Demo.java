package j_15;

import java.util.Locale;
import java.util.Scanner;

public class Demo {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        input.useLocale(Locale.US);

        System.out.println("wpisz tekst");
        String usrVar1 = input.nextLine();

        System.out.println("wpisz kolejnny tekst");
        String usrVar2 = input.nextLine();

        int lengUsrVar2 = usrVar2.length();

        //search separator
        String letter = "";

        for (int  i = lengUsrVar2; i > 0 ; i--) {

            if (i == (lengUsrVar2 - 3)) {

                letter = usrVar2.valueOf(usrVar2.charAt(i));

            }

        }

        for (String word:usrVar1.split(letter)) {

            System.out.println(word);

        }
    }
}
