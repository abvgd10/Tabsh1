package VEHICLES;

import java.util.spi.LocaleNameProvider;

public class Car {
    private String marka;
    private int godvypuska;
    private String color;
    private String tipperedachi;
    private String rul;
    private double price;

    public Car(){

    }

    public Car(String marka, int godvypuska, String color, String tipperedachi, String rul, double price) {
        this.marka = marka;
        this.godvypuska = godvypuska;
        this.color = color;
        this.tipperedachi = tipperedachi;
        this.rul = rul;
        this.price = price;
    }

    public String getMarka() {
        return marka;
    }

    public void setMarka(String marka) {
        this.marka = marka;
    }

    public int getGodvypuska() {
        return godvypuska;
    }

    public void setGodvypuska(int godvypuska) {
        this.godvypuska = godvypuska;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getTipperedachi() {
        return tipperedachi;
    }

    public void setTipperedachi(String tipperedachi) {
        this.tipperedachi = tipperedachi;
    }

    public String getRul() {
        return rul;
    }

    public void setRul(String rul) {
        this.rul = rul;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Car{" +
                "\n marka='" + marka + '\'' +
                "\n godvypuska=" + godvypuska +
                "\n color='" + color + '\'' +
                "\n tipperedachi='" + tipperedachi + '\'' +
                "\n rul='" + rul + '\'' +
                "\n price=" + price +
                '}';
    }
}
