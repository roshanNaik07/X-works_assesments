package com.xworkz.Clip;

public class ClipRunner {
    public static void main(String[] args) {

        Clip clip1 = new Clip();
        clip1.color="Blue";
        Clip clip2 = new Clip();
        clip2.color="Yellow";
        Clip clip3 = new Clip();
        clip3.color="Red";
        Clip clip4 = new Clip();
        clip4.color="White";
        Clip clip5 = new Clip();
        clip5.color="Purple";

        Clip[] clips={clip1,clip2,clip3,clip4,clip5};

        Pushpa pushpa =new Pushpa();
        pushpa.useClip(clips);


    }
}
