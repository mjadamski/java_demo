package j_03;

public class Demo {
    public static void main(String[] args) {

        int wiek = 32;

        System.out.println("Witaj Michał! Słyszałem, że masz " + wiek + "(dużo) lat i się uczysz programowania, czy to prawda?");

        boolean wiek_potw = true;

        System.out.println(wiek_potw);

        char ini_im = 'M';
        char ini_naz = 'A';

        System.out.println("Czy twoje inicjały to " + ini_im + ini_naz + "?\n");

        boolean potw = true;

        System.out.println("Tak " + potw);

        TypeTester typeTester = new TypeTester();
        typeTester.printType('c');

    }
}
