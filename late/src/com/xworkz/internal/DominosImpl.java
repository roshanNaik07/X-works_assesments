package com.xworkz.internal;

public class DominosImpl implements Restaurant {
    public DominosImpl() {
        System.out.println("DominosImpl constructor");
    }

    @Override
    public void serveFood() {
        System.out.println("Serving food at DominosImpl");
    }
}
