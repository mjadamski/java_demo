package j_41;

import java.util.InputMismatchException;
import java.util.Locale;
import java.util.Scanner;

public class Demo {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        input.useLocale(Locale.US);

        String name = null;
        String surrname = null;
        int age = 0;

        boolean error = true;

        while (error) {
            try {
                System.out.println("podaj imie");
                name = input.nextLine();

                System.out.println("podaj nazwisko");
                surrname = input.nextLine();

                System.out.println("podaj wiek");
                age = input.nextInt();
            } catch (NullPointerException n) {
                System.out.println("nulle nulle nulle - wszędzie widze nulle");
            } catch (InputMismatchException e){
                System.out.println("ŹLE!!");
            }
            error = false;
        }


        System.out.print("name = " + name + " ");
        System.out.print("surname = " + surrname + " ");
        System.out.print("age = " + age + "\n");

    }
}
