package j_24;

public class Auto {

    String brand;
    String model;
    int price;
    int year;

    public Auto(String brand, String model, int price, int year) {
        this.brand = brand;
        this.model = model;
        this.price = price;
        this.year = year;
    }

    @Override
    public String toString() {
        return "Auto{" +
                "brand= '" + brand + '\'' +
                ", model= '" + model + '\'' +
                ", price= " + price +
                ", year= " + year +
                '}';
    }
}
