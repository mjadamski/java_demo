package j_37;

public class Book {

    private String nazwa;
    private String autor;
    private  int rokWydania;

    public Book(String nazwa, String autor, int rokWydania) {
        this.nazwa = nazwa;
        this.autor = autor;
        this.rokWydania = rokWydania;
    }

    public Book() {
    }

    public String getNazwa() {
        return nazwa;
    }

    public String getAutor() {
        return autor;
    }

    public int getRokWydania() {
        return rokWydania;
    }

    public void setNazwa(String nazwa) {
        this.nazwa = nazwa;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public void setRokWydania(int rokWydania) {
        this.rokWydania = rokWydania;
    }

    @Override
    public String toString() {
        return "Book{" +
                "nazwa= '" + nazwa + '\'' +
                ", autor= '" + autor + '\'' +
                ", rokWydania= " + rokWydania +
                '}';
    }
}
