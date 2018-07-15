package scrachbook;

import java.util.HashSet;
import java.util.Set;

public class scr_02 {
    public static void main(String[] args) {

        Set<String> newSet = new HashSet<String>();

        newSet.add("1");
        newSet.add("2");
        newSet.add("qwe");
        newSet.add("sa");
        newSet.add("1");

        for(String elem : newSet) {
            System.out.print(elem + "\t");
        }
        System.out.println();

        System.out.println("czy istnieje 1 w newSet? " + newSet.contains("1"));

        System.out.println("wielkosc newSet: " + newSet.size());

        newSet.clear();

        for(String elem : newSet) {
            System.out.print(elem + "\t");
        }
        System.out.println("\n-=-");



    }
}
