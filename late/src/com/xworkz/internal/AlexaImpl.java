package com.xworkz.internal;

public class AlexaImpl implements SmartAssistant {
    public AlexaImpl() {
        System.out.println("AlexaImpl constructor");
    }

    @Override
    public void giveReminder() {
        System.out.println("Reminder from AlexaImpl");
    }
}
