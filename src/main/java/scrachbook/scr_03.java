package scrachbook;

import java.util.HashMap;
import java.util.Map;

public class scr_03 {

    public static void main(String[] args) {

        Map<Integer, Double> newMap = new HashMap<Integer, Double>();

        newMap.put(2, 3.5);
        newMap.put(1, 3.7);
        newMap.put(22, 7.5);
        newMap.put(4, 2233.75);
        newMap.put(42, 32.5);
        newMap.put(7, 33.51);
        newMap.put(27, 3.54644);

        System.out.println(newMap.get(42));

        System.out.println(newMap.get(22));
        newMap.remove(22);
        System.out.println(newMap.get(22));
        System.out.println(newMap.keySet());
        System.out.println(newMap.values());

    }

}
