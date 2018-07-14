package j6;

import java.util.Random;

/**
 * Created by emawary on 2018-06-14.
 */
public class Demo {

    public static void main(String[] args) {

        Random random = new Random();

        int x = random.nextInt();
        int y = random.nextInt();

        System.out.println(x > y ? true : false);
        System.out.println((x * 2) > y ? true: false );
        System.out.println((y < (x + 3)) && y > (x -2)? true : false);
        System.out.println((x * y) % 2 == 0 ? true : false);



    }

}
