package scrachbook;

public class DemoPojazd {
    public static void main(String[] args) {

        Rower rower       = new Rower();
        Samochod samochod = new Samochod();


        Pojazd rowerA    = new Rower();
        Pojazd samochodA = new Samochod();

        rower.jaza();
        rower.opis();

        samochod.jaza();
        samochodA.jaza();

        ((Rower) rowerA).opis();

        //rowerA.opis();

        //((Rower) samochodA).opis();


    }

}
