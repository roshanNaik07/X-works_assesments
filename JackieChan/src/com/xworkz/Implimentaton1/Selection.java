package com.xworkz.Implimentaton1;

import com.xworkz.Rules.Cricket;
import com.xworkz.Rules.Crop;

public class Selection implements Cricket, Crop {

    @Override
    public void rules() {
        System.out.println("Selection rules");
    }

    @Override
    public void players() {
        System.out.println("Selection safety");
    }

    @Override
    public void umpireDecision() {
        System.out.println("Selection equipment");
    }

    @Override
    public void yield() {
        System.out.println("Selection crop");
    }
    @Override
    public void growth() {
        System.out.println("Selection season");
    }

    @Override
    public void crop() {
        System.out.println("Selection crop");
    }

}
