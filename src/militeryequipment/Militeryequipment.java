package militeryequipment;

public class Militeryequipment {

    // i like this idea
    //amazing!!!!
    public static String c() {

        System.out.println();
        System.out.println("    Ваенная техника Tанки");
        Militeryequipment1 tank = new Tank("Tank T-34",30.9,
                (byte) 4,5.92,3,2.45,170, 73);
        System.out.println(tank);
        System.out.println();

        Militeryequipment1 tank1 = new Tank("Tank ИС-3",49,
                (byte) 4,9.25,3.39,2.45,190, 122);
        System.out.println(tank1);
        System.out.println();

        Militeryequipment1 tank2 = new Tank("Tank КВ-2",62,
                (byte) 6,6.95,3.32,3.45,160, 152);
        System.out.println(tank2);
        System.out.println();

        Militeryequipment1 tank3 = new Tank("Tank ИC-7",68,
                (byte) 5,7.38,3.45,2.48,260, 130);
        System.out.println(tank3);
        System.out.println();

        System.out.println();
        System.out.println("     Истрибители");
        Militeryequipment1 istribitel = new Istribitel("Истрибител Cу-57", 18.0, (byte) 1,
                19.4,14,4.8,50,30);
        System.out.println(istribitel);
        System.out.println();

        Militeryequipment1 istribitel1 = new Istribitel("Истрибител Cу-35", 19.0, (byte) 1,
                21.9,14.75,5.8,55,50);
        System.out.println(istribitel1);
        System.out.println();

        String t = "         The end  ";
        return t;

    }
}

