package j28;

/**
 * Created by emawary on 2018-07-21.
 */
public class Chromosom {

    private int nrChromosomu;
    private double dlRamion;
    private String plciowy;

    //Java does not support the concept of default parameter
    public Chromosom(int nrChromosomu, double dlRamion, String plciowy) {
        this.nrChromosomu = nrChromosomu;
        this.dlRamion = dlRamion;
        this.plciowy = plciowy;
    }

    public Chromosom(int nrChromosomu, double dlRamion) {
        this.nrChromosomu = nrChromosomu;
        this.dlRamion = dlRamion;
    }

    public Chromosom() {
    }

    public int getNrChromosomu() {
        return nrChromosomu;
    }

    public void setNrChromosomu(int nrChromosomu) {
        this.nrChromosomu = nrChromosomu;
    }

    public double getDlRamion() {
        return dlRamion;
    }

    public void setDlRamion(double dlRamion) {
        this.dlRamion = dlRamion;
    }

    public String getPlciowy() {
        return plciowy;
    }

    public void setPlciowy(String plciowy) {
        this.plciowy = plciowy;
    }

    @Override
    public String toString() {
        return "Chromosom{" +
                "nrChromosomu=" + nrChromosomu +
                ", dlRamion=" + dlRamion +
                ", plciowy=" + plciowy +
                '}';
    }
}
