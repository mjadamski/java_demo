package scrachbook.figury;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Demo {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        input.useLocale(Locale.US);

        System.out.println("Podaj bok");

        double a = input.nextDouble();

        Figur square    = new Square(5);
        Figur square2    = new Square(a);
        Figur rectangle = new Rectangle(10, 5);
        Figur circle    = new Circle(4);
        Figur triangle  = new Triangle(3,4,5);


//        System.out.println(square.area());
//        System.out.println(square2.area());
//        System.out.println(rectangle.area());
//        System.out.println(circle.area());
//        System.out.println(triangle.area());

        PrintHelper.PrintArea(square.area());
        PrintHelper.PrintArea(square2.area());
        PrintHelper.PrintArea(rectangle.area());
        PrintHelper.PrintArea(circle.area());
        PrintHelper.PrintArea(triangle.area());




        List<Figur> figures = new ArrayList<Figur>();

        figures.add(square);
        figures.add(rectangle);
        figures.add(circle);
        figures.add(triangle);

        for(Figur figura: figures) {
            System.out.print(figura.area() + " ");
            System.out.println(figura.perimeter());
        }



    }
}
