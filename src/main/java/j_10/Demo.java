package j_10;

import java.util.Scanner;

public class Demo {
    public static void main(String[] args) {

        System.out.println("wpisz jakiś tekst");

        Scanner input = new Scanner(System.in);
        String text = input.nextLine();
        System.out.println("długość tekstu: " + text.length());

        int bezBialych = text.replaceAll("\\s+", "").length();
        System.out.print("znaki białe: ");
        System.out.println(text.length() - bezBialych);
    }
}
