package j_19;

import java.util.Random;

public class Demo {
    public static void main(String[] args) {

        Random random = new Random();

        int [] tab = new int [10];

        final int MAX = 10;
        final int MIN = -10;

        //fill tab
        for (int i = 0; i < tab.length; i++) {
            tab[i] = random.nextInt((MAX-MIN)+1)+MIN;
        }

        int max = 0;
        int min = 0;
        int sum = 0;

        for (int i = 0; i < tab.length; i++) {
            sum += tab[i];

            if(i==0) {
                max = tab[i];
                min = tab[i];
                continue;
            }

            if (max < tab[i]) {
                max = tab[i];
            }

            if (min > tab[i]) {
                min = tab[i];
            }
        }

        int srednnia = sum / tab.length;

        System.out.println("max " + max);
        System.out.println("min " + min);
        System.out.println("srednia " + srednnia);

        int sumBelowAvarage = 0;
        int sumUpperAvarage = 0;

        for (int i = 0; i < tab.length; i++) {

            if (srednnia > tab[i]) {
                sumBelowAvarage ++;
            }

            if (srednnia <tab[i]) {
                sumUpperAvarage ++;
            }
        }

        System.out.println("ilosc liczb poniżej sredniej " + sumBelowAvarage);
        System.out.println("ilosc liczb powyżej sredniej " + sumUpperAvarage);
        System.out.println("\n wylosowane liczby \n");

        for (int i = 0; i < tab.length; i++) {
            System.out.print(tab[i] +"\t");
        }
        System.out.println("\n=-=-=-=-=");
        System.out.println("kolejność odwrotna");

        for (int i = tab.length-1; i >= 0; i--) {
            System.out.print(tab[i] + "\t");
        }
        System.out.println("\n=-=-=-=-=");


    }
}
