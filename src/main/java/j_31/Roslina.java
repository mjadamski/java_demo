package j_31;

public class Roslina extends Organizm {

    public Roslina(String name, String rodzaj) {
        super(name, rodzaj);
    }

    public Roslina() {
    }

    public void akcja(Organizm organizm) {
        System.out.println("roslina " + organizm.getName());

    }
}
