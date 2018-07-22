package scrachbook.figury;

public class Square implements Figur {

    private double a;

    public Square() {
    }

    public Square(double a) {
        this.a = a;
    }

    @Override
    public double area() {
        return a * a;
    }

    @Override
    public double perimeter() {
        return 4 * a;
    }



    @Override
    public String toString() {
        return "Square{" +
                "a=" + a +
                " - area=" + area() +
                ", perimeter=" + perimeter() +
                '}';
    }
}
