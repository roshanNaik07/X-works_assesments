package com.xworkz.Rules;

public class MayuraLogistics implements Logistics {

    @Override
    public void rules() {
        System.out.println("Logistics rules");
    }

    @Override
    public void transportation() {
        System.out.println("Logistics transportation");
    }

    @Override
    public void warehousing() {
        System.out.println("Logistics warehousing");
    }

    @Override
    public void approval() {
        System.out.println("Logistics approval is important");
    }
}
