package com.company;

import APPLIANCES.Appliances;
import VEHICLES.Vehicles;
import militeryequipment.Militeryequipment;

public class Main {

    public static void main(String[] args) {

        Appliances appliances = new Appliances();
        String q = Appliances.a();
        System.out.println(q);

        Vehicles vehicles = new Vehicles();
        String w = Vehicles.b();
        System.out.println(w);

        Militeryequipment militeryequipment = new Militeryequipment();
        String e = Militeryequipment.c();
        System.out.println(e);
    }
}
