package scrachbook.figury;

public class Rectangle implements Figur {

    private double width;
    private double lenght;


    @Override
    public double area() {
        return width * lenght;
    }

    @Override
    public double perimeter() {
        return 2 * (width + lenght);
    }

    public Rectangle(double width, double lenght) {
        this.width = width;
        this.lenght = lenght;
    }

    public Rectangle() {
    }

    @Override
    public String toString() {
        return "Rectangle{" +
                "width=" + width +
                ", lenght=" + lenght +
                " - area=" + area() +
                ", perimeter=" + perimeter() +
                '}';
    }
}
