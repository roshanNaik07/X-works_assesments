package com.xworkz.internal;

public class WhatsAppImpl implements MessagingApp {
    public WhatsAppImpl() {
        System.out.println("Running no-arg const of WhatsAppImpl");
    }

    @Override
    public void sendMessage() {
        System.out.println("Sending message through WhatsAppImpl");
    }
}
