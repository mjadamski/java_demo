package JDBC.sql.model;

public class OpiekunowieProdukty {

    private int id_o;
    private int id_p;

    private String name_o;
    private String last_o;

    private double price_p;
    private String name_p;

    public OpiekunowieProdukty(int id_o, int id_p, String name_o, String last_o, double price_p, String name_p) {
        this.id_o = id_o;
        this.id_p = id_p;
        this.name_o = name_o;
        this.last_o = last_o;
        this.price_p = price_p;
        this.name_p = name_p;
    }

    public OpiekunowieProdukty() {
    }

    public int getId_o() {
        return id_o;
    }

    public void setId_o(int id_o) {
        this.id_o = id_o;
    }

    public int getId_p() {
        return id_p;
    }

    public void setId_p(int id_p) {
        this.id_p = id_p;
    }

    public String getName_o() {
        return name_o;
    }

    public void setName_o(String name_o) {
        this.name_o = name_o;
    }

    public String getLast_o() {
        return last_o;
    }

    public void setLast_o(String last_o) {
        this.last_o = last_o;
    }

    public double getPrice_p() {
        return price_p;
    }

    public void setPrice_p(double price_p) {
        this.price_p = price_p;
    }

    public String getName_p() {
        return name_p;
    }

    public void setName_p(String name_p) {
        this.name_p = name_p;
    }

    @Override
    public String toString() {
        return "OpiekunowieProdukty{" +
                "id_o=" + id_o +
                ", id_p=" + id_p +
                ", name_o='" + name_o + '\'' +
                ", last_o='" + last_o + '\'' +
                ", price_p=" + price_p +
                ", name_p='" + name_p + '\'' +
                '}';
    }
}
