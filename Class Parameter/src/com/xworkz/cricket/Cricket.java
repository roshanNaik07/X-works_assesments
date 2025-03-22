package com.xworkz.cricket;

public class Cricket {

    Ticket ticket;

    public Cricket(Ticket ticket){
        this.ticket=ticket;
    }


    public void watch(){
        if(this.ticket!=null){
            ticket.buy();
        }
        else System.out.println("ticket is pointing to null");
    }

    public void profit(){
        if (this.ticket!=null){
            ticket.sell();
        }
        else System.out.println("ticket is pointing to null");
    }
}
