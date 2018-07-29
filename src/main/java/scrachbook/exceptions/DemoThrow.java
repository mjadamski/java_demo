package scrachbook.exceptions;


import java.util.Scanner;

class MyAritmeticException extends Exception{
    public MyAritmeticException(String message) {
        super (message);
    }
}

class MyFirstThrow {

    public void nowThrowSomething() throws MyAritmeticException {

        int x = 10;
        int y = 0;

        Scanner scanner = new Scanner(System.in);
        System.out.println("podaj dzielnik: \n");

        y = scanner.nextInt();

        if (y == 0) {
           // throw new ArithmeticException("nie można dzielić przez 0!");
            throw new MyAritmeticException("nie można dzielić przez 0!");
        } else {
            System.out.println(x/y);
        }

    }

}

public class DemoThrow {

    public static void main(String[] args) {

        MyFirstThrow myFirstThrow = new MyFirstThrow();

        try {
            myFirstThrow.nowThrowSomething();
        } catch (MyAritmeticException e) {
            e.printStackTrace();
        }


    }

}
