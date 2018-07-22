package j_30a;

import j_30.Point2D;

public class PointAplication {

    public static void main(String[] args) {

        Point2D point2D = new Point2D(1,2);
        point2D.movePoint(5,5);

        System.out.println(point2D);

        Point3D point3D = new Point3D(10,20,30);
        System.out.println(point3D);
        point3D.movePoint(5,5);

        System.out.println(point3D);



    }

}
