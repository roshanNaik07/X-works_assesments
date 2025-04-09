package com.xworkz.AfterYugadi.Internal;

public class ArmyVehicle {

    public void wheel(Rubber rubber){

        //Castiing : converting the parent data Type to child dataType
        rubber.expand();
        if(rubber instanceof Tyre){
            //Castiing : converting the parent data Type to child dataType
            System.out.println("Rubber is tyre");

            Tyre tyre = (Tyre) rubber;
            tyre.compress();
            tyre.expand();
        }

        if(rubber instanceof MrfTyres){
            System.out.println("rubber is MrfTyres");

            MrfTyres mrfTyres = (MrfTyres) rubber;
            mrfTyres.price();
            mrfTyres.expand();
            mrfTyres.compress();
        }

    }
}

