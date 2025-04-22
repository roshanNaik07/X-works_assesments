package com.xworkz.external;

import com.xworkz.internal.EntertainmentApp;

public class Viewer {
    EntertainmentApp entertainmentApp;

    public Viewer(EntertainmentApp entertainmentApp) {
        this.entertainmentApp = entertainmentApp;
        System.out.println("Running EntertainmentApp param const in Viewer");
    }

    public void watch() {
        System.out.println("Running watch in Viewer");
        this.entertainmentApp.playContent();
    }
}
