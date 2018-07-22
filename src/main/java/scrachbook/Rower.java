package scrachbook;

public class Rower implements Pojazd {
    @Override
    public void jaza() {
        System.out.println("popedałujemy");
    }

    @Override
    public void stop() {
        System.out.println("stop rowerku");
    }

    public void opis() {
        System.out.println("rowerek!");
    }

}
