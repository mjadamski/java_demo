package j222;

import java.util.*;

/**
 * Created by emawary on 2018-06-15.
 */
public class Demo {

    public static void main(String[] args) {

        Map<String, Integer> productMap = new HashMap<String, Integer>();

        productMap.put("mleko"     , 1);
        productMap.put("jajka"     , 2);
        productMap.put("chleb"     , 3);
        productMap.put("mąka"      , 4);
        productMap.put("cukier"    , 5);
        productMap.put("bułki"     , 6);
        productMap.put("pomidory"  , 7);
        productMap.put("woda"      , 9);
        productMap.put("pomarańcze", 8);
        productMap.put("ser"       , 9);

        Scanner scanner       = new Scanner(System.in);
        List<String> products = new ArrayList<String>();
        int sumOfProducts     = 0;

        while (scanner.hasNextLine()) {

            String token = scanner.nextLine();

            if (token.equals("")) {
                scanner.close();
                break;
             }

            if(!productMap.containsKey(token)) {
                continue;
            }

            System.out.println("koszt Twojego produktu to: " + productMap.get(token));

            if(products.contains(token)) {

                System.out.println("produkt już jest w koszyku, dodać? wpisz tak bądź wpisz nie");

                String confirm = scanner.nextLine();

                if(confirm.equals("tak")) {
                    sumOfProducts += productMap.get(token);
                    products.add(token);
                } else {
                    continue;
                }
            } else {
                sumOfProducts += productMap.get(token);
                products.add(token);
            }
        }
        System.out.println("całkowity koszt to zakupów to: " + sumOfProducts);
    }
}
