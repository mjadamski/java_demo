package scrachbook;

import java.util.ArrayDeque;
import java.util.Deque;

public class scr_04 {
    public static void main(String[] args) {

        Deque<String> newQueue = new ArrayDeque<String>();

        newQueue.add("1");
        newQueue.add("23");
        newQueue.addFirst("Rodman");
        newQueue.add("Denis");

        System.out.println(newQueue);

        newQueue.removeFirst();
        System.out.println(newQueue);
        newQueue.removeLast();
        System.out.println(newQueue);


        newQueue.add("1");
        newQueue.add("23");
        newQueue.addFirst("Rodman");
        newQueue.add("Denis");

        System.out.println(newQueue + " klejka przed pobraniem");
        String element = newQueue.pollFirst();

        System.out.println(newQueue + " kolejka po pobraniu");
        System.out.println("wyciaganie pierwszego elementu " + element);
        System.out.println(newQueue);

    }
}
