package com.xworkz.ViratRoutine;
import com.xworkz.Clip.Clip;
import com.xworkz.cricket.Cricket;
import com.xworkz.cricket.Ticket;

public class Virat {
    Brush brush;
    Clip clip;
    Cricket cricket;
    Ticket ticket;

    Virat(Brush brush,Clip clip,Cricket cricket,Ticket ticket){
        this.brush=brush;
        this.clip=clip;
        this.cricket=cricket;
        this.ticket=ticket;
    }

    public void play(){
       if (this.cricket!=null){
           System.out.println("Running play in Virat");
           cricket.watch();
           cricket.profit();
       }
       else System.out.println("cricket is pointing to null");
    }

    public void clean(){
        if (this.brush!=null){
            System.out.println("Running clean in Virat");
            brush.color(BrushColor.Red);
            brush.clean();
            brush.scrub();
        }
        else System.out.println("brush is pointing to null");
    }

    public void relax(){
        if(this.ticket!=null){
            System.out.println("Running relax in Virat");
            ticket.buy();
            ticket.sell();
        }
        else System.out.println("relax is pointing to null");
    }
}

