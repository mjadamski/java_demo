package JDBC.sql.model;

public class Opiekunowie {

    private  String name_o;
    private  String last_o;

    private int id_o;

    public Opiekunowie(String name_o, String last_o, int id_o) {
        this.name_o = name_o;
        this.last_o = last_o;
        this.id_o = id_o;
    }

    public Opiekunowie() {
    }

    public String getName_o() {
        return name_o;
    }

    public String getLast_o() {
        return last_o;
    }

    public int getId_o() {
        return id_o;
    }

    public void setName_o(String name_o) {
        this.name_o = name_o;
    }

    public void setLast_o(String last_o) {
        this.last_o = last_o;
    }

    public void setId_o(int id_o) {
        this.id_o = id_o;
    }

    @Override
    public String toString() {
        return "Opiekunowie{" +
                "name_o='" + name_o + '\'' +
                ", last_o='" + last_o + '\'' +
                ", id_o=" + id_o +
                '}';
    }
}
