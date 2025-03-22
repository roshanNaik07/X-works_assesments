package com.xworkz.ViratRoutine;

import com.xworkz.Clip.Clip;
import com.xworkz.cricket.Cricket;
import com.xworkz.cricket.Ticket;

public class ViratRunner {

    public static void main(String[] args) {

        Clip clip = new Clip();
        Brush brush = new Brush();
        Ticket ticket = new Ticket();
        Cricket cricket=new Cricket(ticket);
        Virat virat = new Virat(brush,clip,cricket,ticket);

        virat.play();
        virat.clean();
        virat.relax();
    }
}
