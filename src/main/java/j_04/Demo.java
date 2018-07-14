package j_04;

import java.math.BigDecimal;
import java.math.BigInteger;

public class Demo {
     public static void main(String[] args) {

        String z1, z2, z3, z4;

        z1 = "jeden";
        z2 = "DWA";
        z3 = z1 + " " + z2;
        z4 = z3 + " kompLet";

        System.out.println(z3.toUpperCase());
        System.out.println(z4.toLowerCase());
        System.out.println(z4.length());
        System.out.println(z3);
        System.out.print(z4.charAt(1));
        System.out.print("  ");
        System.out.println(z4.charAt(4));
        System.out.println(z4);
        System.out.println(z4.charAt(z4.length() - 3));
        System.out.println(z4.substring(0, 9));
        System.out.println(z4.substring(z3.length(), z4.length()));

        StringBuffer text = new StringBuffer();
        text.append(z1);
        text.append(" ");
        text.append(z2);
        System.out.println(text);

       // BigInteger a = 16274327846328438;
        //BigDecimal a = 16274327846328438;
        //float b = 0.46f;

        //System.out.println(a + b);
       // System.out.println(a);

    }
}
