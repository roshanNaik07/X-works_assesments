package com.xworkz.AfterYugadi.Casting;

import com.xworkz.AfterYugadi.Internal.Eraser;
import com.xworkz.AfterYugadi.Internal.Nataraj;

public class EraserBrand {

    public void type(Eraser eraser){
        eraser.eraser();
        eraser.color();
        eraser.buy();
        eraser.use();
        eraser.price();

        if (eraser instanceof Nataraj){
            Nataraj nataraj = (Nataraj) eraser;
            nataraj.brand();
        }
    }
}
