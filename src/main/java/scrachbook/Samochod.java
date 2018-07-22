package scrachbook;

public class Samochod implements Pojazd {
    @Override
    public void jaza() {
        System.out.println("jazda gwiazda");
    }

    @Override
    public void stop() {
        System.out.println("nie ma jazdy (bez gwiazdy");
    }

    public void opis() {
        System.out.println("auto!");
    }
}
