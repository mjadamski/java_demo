package j_30;

public class Point2D {

    protected int x;
    protected int y;

    public Point2D(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public Point2D() {
        x = 0;
        y = 0;
    }

    public void movePoint(int x, int y) {

        System.out.println("move point 2D");
        this.x += x;
        this.y += y;

    }


    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }

    @Override
    public String toString() {
        return "Point2D{" +
                "x=" + x +
                ", y=" + y +
                '}';
    }
}
