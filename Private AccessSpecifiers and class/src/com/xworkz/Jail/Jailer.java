package com.xworkz.Jail;

public class Jailer {

    //class as a local variable
    public void maintainJail(){
        Jail jail=new Jail();
        jail.setTotalCell(10);
        System.out.println("Jail to maintain :"+jail.getTotalCell());
    }

    //class as a parameter
    public void jailName(Jail jail){
        if(jail!=null){
            System.out.println("Jail name is : "+jail.getName());
        }
        else System.out.println("jail is pointing to null");
    }


    //array of class as a local variable
    public void jailLocation(){

        Jail jail1 = new Jail();
        jail1.setLocation("Rajajinagr");
        Jail jail2 = new Jail();
        jail2.setLocation("Gandi Nagar");
        Jail[] jails ={jail1,jail2};
        for (Jail ref:jails){
            System.out.println("Jail location : "+ref.getLocation());
        }
    }

    public void oldJails(Jail[] jails){

        if(jails!=null){
            for (Jail ref:jails){
                System.out.println("Old Jail names are :"+ref.getName());
            }
        }

    }


}
