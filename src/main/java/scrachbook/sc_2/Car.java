package scrachbook.sc_2;

public class Car extends Vehicle {


    @Override
    public void speedUp() {
        System.out.println("autko Car przyspiesza");
        setSpeed(getSpeed() + 5);
    }
}
