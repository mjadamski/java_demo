package JDBC.sql.model;

public class Produkty {

   private int id_p;
   private String name_p;
   private double price_p;
   private int id_o;

    public Produkty(int id_p, String name_p, double price_p, int id_o) {
        this.id_p = id_p;
        this.name_p = name_p;
        this.price_p = price_p;
        this.id_o = id_o;
    }

    public Produkty() {
    }

    public int getId_p() {
        return id_p;
    }

    public String getName_p() {
        return name_p;
    }

    public double getPrice_p() {
        return price_p;
    }

    public int getId_o() {
        return id_o;
    }

    public void setId_p(int id_p) {
        this.id_p = id_p;
    }

    public void setName_p(String name_p) {
        this.name_p = name_p;
    }

    public void setPrice_p(double price_p) {
        this.price_p = price_p;
    }

    public void setId_o(int id_o) {
        this.id_o = id_o;
    }

    @Override
    public String toString() {
        return "Produkty{" +
                "id_p=" + id_p +
                ", name_p='" + name_p + '\'' +
                ", price_p='" + price_p + '\'' +
                ", id_o=" + id_o +
                '}';
    }
}
