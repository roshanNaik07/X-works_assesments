package com.xworkz.cricket;

public class Ticket {
    public void type()
    {
        TicketType[] type = TicketType.values();

        for(TicketType ref : type){
            System.out.println("Type of the ticket is "+ref);
        }
    }

    public void cost(){
        System.out.println("Running cost in ticket");
    }
    public void buy(){
        System.out.println("Running buy in ticket");
    }
    public void sell(){
        System.out.println("Running sell in ticket");
    }
}
