package APPLIANCES;

public class Appliacesteh {
    private String namafirma;
    private double price;
    private byte guarantee;

    public Appliacesteh(String namafirma, double price, byte guarantee) {
        this.namafirma = namafirma;
        this.price = price;
        this.guarantee = guarantee;
    }

    public Appliacesteh() {
    }

    public String getNamafirma() {
        return namafirma;
    }

    public void setNamafirma(String namafirma) {
        this.namafirma = namafirma;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public byte getGuarantee() {
        return guarantee;
    }

    public void setGuarantee(byte guarantee) {
        this.guarantee = guarantee;
    }

    @Override
    public String toString() {
        return "Appliances{" +
                "\n namafirma='" + namafirma +
                "\n price=" + price +
                "\n guarantee=" + guarantee +
                '}';
    }
}
