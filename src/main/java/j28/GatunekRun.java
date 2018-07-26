package j28;

/**
 * Created by emawary on 2018-07-21.
 */
public class GatunekRun {

    public static void main(String[] args) {

        GatunekController gf = new GatunekController();
        System.out.println("Kot");
        gf.dodajGatunek("Kot","Domowy",1);
        System.out.println("Pies");
        gf.dodajGatunek("Pies","Domowy", 1);
        gf.pokazGatunek();

        System.out.println("after remove cat");
        gf.usunGatunek("Kot","Domowy",1);
        gf.pokazGatunek();

    }

}
