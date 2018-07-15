package scrachbook;

import java.util.*;

public class scr_01 {
    public static void main(String[] args) {

        List<String> lista = new ArrayList<String>();

        lista.add("abc");
        lista.add("34");
        lista.add("tysiąc pińcet");

        for (String elem: lista){
            System.out.print(elem + "\t");
        }
        System.out.println();
        System.out.println(lista.size());
        System.out.println(lista.get(1));

        lista.remove("34");

        for (String elem: lista) {
            System.out.print(elem + "\t");
        }
        System.out.println();

        lista.remove(1);

        for (String elem: lista) {
            System.out.print(elem + "\t");
        }
        System.out.println();

        lista.add("42");
        lista.add("Worms");
        lista.add("aaaa");
        lista.add("bbbb");

        for (String elem: lista) {
            System.out.print(elem + "\t");
        }
        System.out.println();

        System.out.println("czy jest tekst aaaa?  " + lista.contains("aaaa"));
        System.out.println("czy jest tekst cccc?  " + lista.contains("cccc"));





    }
}
