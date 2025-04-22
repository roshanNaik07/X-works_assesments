package com.xworkz.internal;

public class JioImpl implements TelecomService {
    public JioImpl() {
        System.out.println("JioImpl constructor");
    }

    @Override
    public void provideNetwork() {
        System.out.println("Network provided by JioImpl");
    }
}
