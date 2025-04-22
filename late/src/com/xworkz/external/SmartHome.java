package com.xworkz.external;

import com.xworkz.internal.SmartAssistant;

public class SmartHome {
    SmartAssistant assistant;

    public SmartHome(SmartAssistant assistant) {
        this.assistant = assistant;
        System.out.println("SmartHome constructor with SmartAssistant");
    }

    public void controlHome() {
        if (assistant != null) {
            System.out.println("Controlling home via SmartAssistant");
            assistant.giveReminder();
        }
    }
}
