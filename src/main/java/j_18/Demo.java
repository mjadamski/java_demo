package j_18;

import java.util.Locale;
import java.util.Scanner;

public class Demo {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        input.useLocale(Locale.US);

        int [] tab1 = new int[3];
        int [] tab2 = new int[3];

        tab1[0] = 1;
        tab1[1] = 2;
        tab1[2] = 3;

        tab2[0] = 4;
        tab2[1] = 5;
        tab2[2] = 6;

        int sumTab1 = 0;
        int sumTab2 = 0;

        for (int elem : tab1) {
            sumTab1 += elem;
        }

        for (int elem : tab2) {
            sumTab2 += elem;
        }

        System.out.println(sumTab1);
        System.out.println(sumTab2);
        System.out.println(sumTab1 + sumTab2);
    }
}
