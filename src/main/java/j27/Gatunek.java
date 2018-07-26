package j27;

import j28.Chromosom;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by emawary on 2018-07-21.
 */
public class Gatunek {

    private String nazwaGatunek;
    private String rodzajGatunku;
    private int lChromosow;

    List<Chromosom> listaChromosow = new ArrayList<Chromosom>();

    public Gatunek(String nazwaGatunek, String rodzajGatunku, int lChromosow) {
        this.nazwaGatunek = nazwaGatunek;
        this.rodzajGatunku = rodzajGatunku;
        this.lChromosow = lChromosow;
    }

    public Gatunek() {
    }

    public List<Chromosom> getListaChromosow() {
        return listaChromosow;
    }

    public String getNazwaGatunek() {
        return nazwaGatunek;
    }

    public void setNazwaGatunek(String nazwaGatunek) {
        this.nazwaGatunek = nazwaGatunek;
    }

    public String getRodzajGatunku() {
        return rodzajGatunku;
    }

    public void setRodzajGatunku(String rodzajGatunku) {
        this.rodzajGatunku = rodzajGatunku;
    }

    public int getlChromosow() {
        return lChromosow;
    }

    public void setlChromosow(int lChromosow) {
        this.lChromosow = lChromosow;
    }

    @Override
    public String toString() {
        return "Gatunek{" +
                "nazwaGatunek='" + nazwaGatunek + '\'' +
                ", rodzajGatunku='" + rodzajGatunku + '\'' +
                ", lChromosow=" + lChromosow +
                '}';
    }




}
