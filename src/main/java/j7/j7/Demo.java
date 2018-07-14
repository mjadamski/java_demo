package j7;

import java.math.BigInteger;

/**
 * Created by emawary on 2018-06-14.
 */
public class Demo {

    public static void main(String[] args) {

        BigInteger a = new BigInteger("32329372836287632763276327362732");
        BigInteger b = new BigInteger("63427453875496850694233242322322");

        System.out.println(a.add(b));
        System.out.println(a.subtract(b));
        System.out.println(a.multiply(b));
        System.out.println(a.subtract(b));

        System.out.println(BigInteger.ONE  + "ONE");
        System.out.println(BigInteger.ZERO + "ZERO");

    }

}
