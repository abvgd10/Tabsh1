package APPLIANCES;

public class Appliances {


    public static String a() {
        System.out.println();
        System.out.println("       Haladilniki");
        Appliacesteh haladilnik = new Haladilnik("Liebherr", (double) 115.999, (byte) 11);
        System.out.println(haladilnik);
        System.out.println();

        Appliacesteh haladilnik1 = new Haladilnik("gorenje", (double) 47.999, (byte) 7);
        System.out.println(haladilnik1);
        System.out.println();

        System.out.println("       Duhovki");
        Appliacesteh duhovka = new Duhovka("Liebherr", 9.999, (byte) 2);
        System.out.println(duhovka);
        System.out.println();

        Appliacesteh duhovka1 = new Duhovka("gorenje", 29.999, (byte) 5);
        System.out.println(duhovka1);
        System.out.println();

        System.out.println("       Blendery");
        Appliacesteh blender = new Blender("gorenje", 2.999, (byte) 1);
        System.out.println(blender);
        System.out.println();

        Appliacesteh blender1 = new Blender("Liebherr", 5.599, (byte) 3);
        System.out.println(blender1);
        System.out.println();

        String w = "         The end ";
        return w;
    }
}
