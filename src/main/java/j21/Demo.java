package j21;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * Created by emawary on 2018-06-15.
 */
public class Demo {

    public static void main(String[] args) {

        List<String> strings = new ArrayList<String>();
        Scanner scanner = new Scanner(System.in);

        while (scanner.hasNextLine()) {

            String token = scanner.nextLine();

            if (token.equals("end")) {
                scanner.close();
                break;
            } else {
                strings.add(token);
            }
        }

        System.out.println(strings);

    }
}
