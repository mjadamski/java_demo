package j_11;

import java.util.Locale;
import java.util.Scanner;

public class Demo {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        input.useLocale(Locale.US);

        System.out.println("podal liczbe A");
        float liczbaA = input.nextFloat();
        System.out.println("podaj znak operacji matematycnzej: + | - | * | /");
        char znak     = input.next().charAt(0);
        System.out.println("podal liczbe b");
        float liczbaB = input.nextFloat();

        System.out.println("wynik");

        switch (znak){
            case '+':
                System.out.println(liczbaA + liczbaB);
                break;
            case '-':
                System.out.println(liczbaA + liczbaB);
                break;
            case '*':
                System.out.println(liczbaA * liczbaB);
                break;
            case '/':
                System.out.println(liczbaA / liczbaB);
                break;
        }
    }
}
