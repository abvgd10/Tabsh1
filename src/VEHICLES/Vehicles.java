package VEHICLES;

public class Vehicles {

    public static String b() {
        System.out.println();
        System.out.println("       Transpart");
        Car car = new Car("BMW",2002,"Кара","Механика","Левый",85000);
        System.out.println(car);
        System.out.println();

        Car car1 = new Car("Lexus",2010,"Ак","Автомат","Левый",175000);
        System.out.println(car1);
        System.out.println();

        Car car2 = new Car("Audi",1995,"Серый","Механика","Левый",56000);
        System.out.println(car2);
        System.out.println();

        Car car3 = new Car("Toyota",2018,"Ак","Автомат","Правый",125000);
        System.out.println(car3);
        System.out.println();

        String t = "      The end";
        return t;
    }
}
