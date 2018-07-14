package j_14;

import java.util.Locale;
import java.util.Scanner;

public class Demo {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        input.useLocale(Locale.US);

        int userInt = input.nextInt();

        for (int i = 0; i <= userInt; i++) {
            if (i % 2 == 0) {
                continue;
            }
            System.out.println(i);

        }
    }
}
