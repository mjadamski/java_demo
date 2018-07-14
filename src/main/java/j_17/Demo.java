package j_17;

import java.util.Locale;
import java.util.Scanner;

public class Demo {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        input.useLocale(Locale.US);

        System.out.println("nowy progam");

        int sumOfNumbers = 0;
        int counter      = 0;
        int max          = 0;
        int min          = 0;

        while(input.hasNextLine()) {

            System.out.println("podaj liczbę do średniej [0 zakancza program]");

            int userVar = input.nextInt();

            //firsts iteration, set current max and min
            if (counter == 0) {

                max = userVar;
                min = userVar;
            }

            if (userVar == 0) {
                break;
            } else {
                sumOfNumbers += userVar;
                //calculate max
                if (max < userVar) {
                    max = userVar;
                }
                //calculate min
                if (min > userVar) {
                    min = userVar;
                }
            }
            counter ++;

        }

        System.out.println("average - srednia: " + sumOfNumbers/counter);
        System.out.println("max: " + max);
        System.out.println("min: " + min);
    }
}
