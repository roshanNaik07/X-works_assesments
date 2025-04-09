package com.xworkz.AfterYugadi.Casting;

import com.xworkz.AfterYugadi.Internal.Dance;
import com.xworkz.AfterYugadi.Internal.Kathak;

public class DanceClass {

    public void performDance(Dance dance){

        dance.compitation();
        dance.learn();
        dance.perform();
        dance.teach();
        dance.practice();

        if(dance instanceof Kathak){

            Kathak kathak = (Kathak) dance;
            kathak.show();
        }
    }
}
