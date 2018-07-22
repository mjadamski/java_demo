package scrachbook;

public class Zoo {
    public static void main(String[] args) {
        Cat cat = new Cat();
        cat.colour = "Czarny";
        System.out.println("zwierzęta dają głos: ");
        System.out.println("Kot: ");
        cat.makeSound();
    }
}
