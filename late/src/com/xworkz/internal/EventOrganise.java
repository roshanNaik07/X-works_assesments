package com.xworkz.internal;

public class EventOrganise implements Speaker {

    public EventOrganise() {
        System.out.println("Running no arg const of EventOrganise");
    }

    @Override
    public void onSpeaker() {
        System.out.println("Running onSpeaker in EventOrganise");

    }
}
