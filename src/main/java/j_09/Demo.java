package j_09;

import java.util.Scanner;

public class Demo {
    public static void main(String[] args) {

        System.out.println("podaj słowo, a odwrócę je");

        Scanner scanner = new Scanner(System.in);
        String text = scanner.nextLine();

        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append(text);
        System.out.println(stringBuffer.reverse());
    }
}
