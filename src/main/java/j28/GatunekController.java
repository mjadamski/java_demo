 package j28;

import j27.Gatunek;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * Created by emawary on 2018-07-21.
 */
public class GatunekController {

    List<Gatunek> listaGatunkow = new ArrayList<Gatunek>();

    Gatunek       nowyGatunek;
    Chromosom     nowyChromosom;

    public void dodajGatunek(String nazwaGatunek, String rodzajGatunku, int l_chromosow) {
        nowyGatunek = new Gatunek(nazwaGatunek, rodzajGatunku, l_chromosow);
        dodajChromosom(nowyGatunek);
        listaGatunkow.add(nowyGatunek);
    }

    public void dodajChromosom(Gatunek przekazanyGatunek) {

        Scanner input = new Scanner(System.in);

        double dlRamion;
        String plec;

        for (int i =0; i < nowyGatunek.getlChromosow(); i++) {

            System.out.println("Podaj długość ramion");
            dlRamion = input.nextInt();

            while (dlRamion < 0) {
                System.out.println("Podaj długość ramion");
                dlRamion = input.nextInt();
            }

            //consume new line
            input.nextLine();

            System.out.println("Podaj płeć XX - płeć żeńska, XY  - płeć męska");

            plec = input.nextLine();

            if(plec.equals("XX")) {
                nowyChromosom = new Chromosom(i, dlRamion, "chromoson żeński");
            } else {
                nowyChromosom = new Chromosom(i, dlRamion, "chromoson męski");
            }
            nowyGatunek.getListaChromosow().add(nowyChromosom);

        }
    }

    public void pokazGatunek() {
        for (Gatunek gatunek: listaGatunkow) {
            System.out.println(gatunek);
            for(Chromosom chromosom : gatunek.getListaChromosow())
                System.out.println(chromosom);
        }
    }

    public void usunGatunek(Gatunek gatunek) {
        listaGatunkow.remove(gatunek);
    }

    public void usunGatunek(String nazwaGatunek, String rodzajGatunku, int l_chromosow) {

        Gatunek candidate = null;

        for(Gatunek gatunek : listaGatunkow) {
            if(gatunek.getNazwaGatunek().equals(nazwaGatunek)
                    && gatunek.getRodzajGatunku().equals(rodzajGatunku)
                    && gatunek.getlChromosow() == l_chromosow) {
                candidate = gatunek;
            }

            listaGatunkow.remove(candidate);

        }

    }














}
