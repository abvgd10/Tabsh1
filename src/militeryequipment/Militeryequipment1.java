package militeryequipment;

public class Militeryequipment1 {
    private String name;
    private double massa;
    private byte ekipaj;
    private double dlinakorpusa;
    private double shirina;
    private double vysota;
    private double kolibrpushri;
    private double dlinapushki;


    public Militeryequipment1() {

    }

    public Militeryequipment1(String name, double massa, byte ekipaj,
                              double dlinakorpusa, double shirina,
                              double vysota, double dlinapushki, double kolibrpushri) {
        this.name = name;
        this.massa = massa;
        this.ekipaj = ekipaj;
        this.dlinakorpusa = dlinakorpusa;
        this.shirina = shirina;
        this.vysota = vysota;
        this.dlinapushki = dlinapushki;
        this.kolibrpushri = kolibrpushri;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getMassa() {
        return massa;
    }

    public void setMassa(double massa) {
        this.massa = massa;
    }

    public byte getEkipaj() {
        return ekipaj;
    }

    public void setEkipaj(byte ekipaj) {
        this.ekipaj = ekipaj;
    }

    public double getDlinakorpusa() {
        return dlinakorpusa;
    }

    public void setDlinakorpusa(double dlinakorpusa) {
        this.dlinakorpusa = dlinakorpusa;
    }

    public double getShirina() {
        return shirina;
    }

    public void setShirina(double shirina) {
        this.shirina = shirina;
    }

    public double getVysota() {
        return vysota;
    }

    public void setVysota(double vysota) {
        this.vysota = vysota;
    }

    public double getDlinapushki() {
        return dlinapushki;
    }

    public void setDlinapushki(double dlinapushki) {
        this.dlinapushki = dlinapushki;
    }

    public double getKolibrpushri() {
        return kolibrpushri;
    }

    public void setKolibrpushri(double kolibrpushri) {
        this.kolibrpushri = kolibrpushri;
    }

    @Override
    public String toString() {
        return "Militeryequipment1{" +
                "\name='" + name + '\'' +
                "\n massa T=" + massa +
                "\n ekipaj=" + ekipaj +
                "\n dlinakorpusa m=" + dlinakorpusa +
                "\n shirina m=" + shirina +
                "\n vysota m=" + vysota +
                "\n dlinapushki cm=" + dlinapushki +
                "\n kolibrpushri mm=" + kolibrpushri +
                '}';
    }
}
