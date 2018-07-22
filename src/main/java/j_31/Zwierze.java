package j_31;

public class Zwierze extends Organizm{

    public Zwierze(String name, String rodzaj) {
        super(name, rodzaj);
    }

    public Zwierze() {
    }

    public void akcja(Organizm organizm) {

        if(organizm instanceof Zwierze);
        System.out.println("zwierze " + getName() + " walczy z " + organizm.getName());

    }


}
