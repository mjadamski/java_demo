package scrachbook.exceptions;

import java.util.Scanner;

public class DemoTryCatch {
    public static void main(String[] args) {

        int tab [] = {1, 2, 3, 4, 5};
        Scanner input = new Scanner(System.in);
        int index = -1;

        System.out.println("podaj index tablicy: ");

        index = input.nextInt();

        try {
            System.out.println(tab[index]);
        } catch (ArrayIndexOutOfBoundsException ex) {
            ex.printStackTrace();
            System.out.println("ŹLE! nie wolno przekroczyć rozmiaru tablicy: " + tab.length);
        } finally {
            System.out.println("finally block");
        }






    }
}
