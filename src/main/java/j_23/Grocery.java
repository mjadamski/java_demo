/*
 Zadanie domowe:

Napisz program który będzie wyświetlał cenę produktu w zależności od podanej nazwy produktu.
I będzie sumował zakupione towary. Do czasu aż użytkownik wciśnie ENTER po czym wyświetli sumę do zapłaty.

Produkty:
Mleko, jajka, chleb, mąka, cukier, bułki, pomidory, woda, pomarańcze, ser
Ceny dowolne.
Do poprzedniego ćwiczenia dodaj funkcjonalność wykrywania tego że produkt jest już w koszyku.
I zapytaj o potwierdzenie użytkownika czy na pewno chce dodać ponownie ten produkt.
 */
package j_23;

import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import java.util.Scanner;

public class Grocery {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        input.useLocale(Locale.US);
        System.out.println("Witaj w sklepie!\nCo chcesz dodać?");

        HashMap<String, Double> warehause = new HashMap<String, Double>();
        HashMap<String, Double> order     = new HashMap<String, Double>();

        warehause.put("mleko", 2.99);
        warehause.put("jajka", 3.99);
        warehause.put("chleb", 2.02);
        warehause.put("mąka", 4.99);
        warehause.put("cukier", 2.99);
        warehause.put("bułki", 1.99);
        warehause.put("pomidory", 0.79);
        warehause.put("woda", 0.99);
        warehause.put("pomarancze", 17.09);
        warehause.put("ser", 3.5);

        while (input.hasNextLine()) {

            String text = input.nextLine();
            int numberOfProducts = 0;
            double sum;

            if (text.equals("")) {
                input.close();
                break;
            }

            }



    }
}
