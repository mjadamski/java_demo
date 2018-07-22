package j_30a;

import j_30.Point2D;

public class Point3D extends Point2D {

    private int z;

    public Point3D(int x, int y, int z) {
        super(x, y);
        this.z = z;
    }

    public Point3D(int x, int y) {
        super(x, y);
        this.z = 00;
    }

    public void movePoint (int x, int y) {

        System.out.println("move point 3D");
        this.x += x;
        this.y += y;

    }

    public int getZ() {
        return z;
    }

    public void setZ(int z) {
        this.z = z;
    }


    public String toString() {
        return "Punkt 3D {" +
                z + " " +
                getX() + " " +
                getY() + "}";

    }

}
