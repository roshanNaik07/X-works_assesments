package com.xworkz.AfterYugadi.Runner;

import com.xworkz.AfterYugadi.Internal.ArmyVehicle;
import com.xworkz.AfterYugadi.Internal.MrfTyres;
import com.xworkz.AfterYugadi.Internal.Rubber;
import com.xworkz.AfterYugadi.Internal.Tyre;

public class RubberRunner {

    public static void main(String[] args) {

        Rubber rubber = new Rubber();
        rubber.expand();
        Rubber rubber1 = new Tyre();
        Tyre tyre = new Tyre();
        tyre.compress();
        tyre.expand();
        MrfTyres mrfTyres = new MrfTyres();          //This is casting we can't access compress method using rubber data tye ex: rubber.compress;<-- X
        mrfTyres.expand();
        mrfTyres.compress();
        mrfTyres.price();

        System.out.println("---------------------------------");
        ArmyVehicle armyVehicle = new ArmyVehicle();
        System.out.println("---------------------------------");
        armyVehicle.wheel(rubber);
        System.out.println("---------------------------------");
        armyVehicle.wheel(tyre);
        System.out.println("---------------------------------");
        armyVehicle.wheel(mrfTyres);
        System.out.println("---------------------------------");
        armyVehicle.wheel(rubber1);
    }
}
