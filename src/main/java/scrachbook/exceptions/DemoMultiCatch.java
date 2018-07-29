package scrachbook.exceptions;

import jdk.internal.util.xml.impl.Input;

import java.util.InputMismatchException;
import java.util.Scanner;

public class DemoMultiCatch {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number [] = new int[2];
        boolean error = true;

        while (error) {

            try {
                System.out.println("podaj liczbę\n");
                number[0] = scanner.nextInt();

                scanner.nextLine();
                System.out.println("podaj kolejną liczbę");
                number[1] = scanner.nextInt();

                scanner.nextLine();

                System.out.println("którą li'czbę wyświetlić < 1 - 2 > ?");
                System.out.println("twoja liczba to: " + number[scanner.nextInt() - 1]);
                for (int i = 0; i < number.length; i++ ) {
                    System.out.print(number[i] + " - ");
                }

                error = false;
            } catch (InputMismatchException ex) {
                System.out.println("popraw liczbę, powinna być całkowita");
            } catch (ArrayIndexOutOfBoundsException ex) {
                System.out.println("miało być 1 lub 2");
            } finally {
                scanner.nextLine();
            }
        }




    }
}
