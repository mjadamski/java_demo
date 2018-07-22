package scrachbook.figury;


public class Circle implements Figur {

    double radius;
    double pi = Math.PI;

    public Circle() {
    }

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public double area() {
        return pi * Math.pow(radius, 2) ;
    }

    @Override
    public double perimeter() {
        return 2 * pi * radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    @Override
    public String toString() {
        return "Circle{" +
                "radius=" + radius +
                ", pi=" + pi +
                " - area=" + area() +
                ", perimeter=" + perimeter() +
                '}';
    }
}
