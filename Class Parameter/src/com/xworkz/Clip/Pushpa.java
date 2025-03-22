package com.xworkz.Clip;

public class Pushpa {

    void useClip(Clip[] clips){

        for(Clip ref :clips){
            if(ref!=null){
                ref.hold();
                ref.displayColor();
            }
            else
                System.out.println("clip is pointing to null");
        }
    }
}
