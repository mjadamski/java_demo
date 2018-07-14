package j_06;

import java.util.Random;

public class Demo {
    public static void main(String[] args) {

        Random random = new Random();

        int x = random.nextInt();
        int y = random.nextInt();
        boolean c = x > y ? true : false;
        boolean d = ((x * 2) > y ? true: false );
        boolean e = (y < (x + 3)) && y > (x -2)? true : false;
        boolean f = (x * y) % 2 == 0 ? true : false;

        System.out.println(x);
        System.out.println(y);
        System.out.println(c);
        System.out.println(d);
        System.out.println(e);
        System.out.println(f);


    }
}
