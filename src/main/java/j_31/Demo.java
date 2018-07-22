package j_31;

public class Demo {
    public static void main(String[] args) {

        Organizm cat    = new Zwierze("Mruczek", "cat");
        Organizm dog    = new Zwierze("Bukiet", "dog");
        Organizm flower = new Roslina("tulipan", "plant");


        cat.akcja(dog);
        dog.akcja(cat);

        flower.akcja(cat);




    }
}
