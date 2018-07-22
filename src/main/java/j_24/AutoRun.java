package j_24;

public class AutoRun {

    public static void main(String[] args) {

        Auto bmw = new Auto("BMW", "Czarny", 3500, 2001);
        Auto fiat = new Auto("Fiat", "Punto", 7000, 2010);
        Auto miazga = new Auto("Miazga", "Błyskawica", 10000000, 2020);

        AutoFactory autoFactory = new AutoFactory();

        autoFactory.addAuto(bmw);
        autoFactory.addAuto(miazga);
        autoFactory.addAuto(fiat);
        autoFactory.addAuto(fiat);

        autoFactory.showAllCars();

        System.out.println("=-=-=-=");
        System.out.println(autoFactory.getAuto(fiat));
        System.out.println("=-=-=-=");
        autoFactory.priceUp(500, fiat);
        System.out.println(autoFactory.getAuto(fiat));
        System.out.println("\n=-=-=-=\n");
        autoFactory.takeAuto(miazga);
        System.out.println("\n=-=-=-=\n");
        autoFactory.showAllCars();
        System.out.println("=-=-=-=");

    }

}
