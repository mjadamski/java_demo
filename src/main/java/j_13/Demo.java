package j_13;

import java.util.Locale;
import java.util.Random;
import java.util.Scanner;

public class Demo {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        input.useLocale(Locale.US);

        int userInt = input.nextInt();

        Random random = new Random();

        final int MAX = 5;
        final int MIN = 1;


        int nuber1 = random.nextInt((MAX-MIN)+1)+MIN;

        if (nuber1 > userInt) {
            System.out.println("Twoja liczba jest MNIEJSZA od number1: " + nuber1);
        } else {
            if (nuber1 < userInt){
                System.out.println("Twoja lizba jesst WIĘKSZA od number1: " + nuber1);
            } else {
                System.out.println("Twoja liczba jest równa number1: " + nuber1);
            }
        }
    }
}
