package scrachbook.sc_2;

public class Demo {
    public static void main(String[] args) {

        Car car       = new Car();
        Vehicle car2 = new Car();

        System.out.println(car2.getSpeed());

        car2.speedUp();

        System.out.println(car2.getSpeed());


    }
}
