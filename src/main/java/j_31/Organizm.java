package j_31;



public class Organizm {

    private String name;
    private String rodzaj;

    public Organizm(String name, String rodzaj) {
        this.name = name;
        this.rodzaj = rodzaj;
    }

    public Organizm() {
    }

    public void akcja(Organizm organizm) {
        System.out.println("jestem organiznem" + organizm);
    }


    public String getName() {
        return name;
    }

    public String getRodzaj() {
        return rodzaj;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setRodzaj(String rodzaj) {
        this.rodzaj = rodzaj;
    }
}
