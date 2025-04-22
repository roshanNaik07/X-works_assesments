package com.xworkz.external;

import com.xworkz.internal.MessagingApp;

public class User {
    MessagingApp messagingApp;

    public User(MessagingApp messagingApp) {
        this.messagingApp = messagingApp;
        System.out.println("Running MessagingApp param const in User");
    }

    public void chat() {
        System.out.println("Running chat in User");
        this.messagingApp.sendMessage();
    }
}
