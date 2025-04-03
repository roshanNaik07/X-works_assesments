package com.xworkz.Satelite;

public class ISRO {

    //class as local variable
    public void firstSatelite(){
        Satelite satelite = new Satelite();
        satelite.setType(Type.communication);
        System.out.println("Type of the satelite is : "+satelite.getType());
    }

    //array of local variable
    public void sateliteTypes(){
        Satelite satelite1 = new Satelite();
        satelite1.setType(Type.Navigation);
        Satelite satelite2 = new Satelite();
        satelite2.setType(Type.Observation);
        Satelite[] satelites={satelite1,satelite2};
        for (Satelite ref : satelites){
            System.out.println("Satelite type are : "+ref.getType());
        }
    }

    public void SateliteWeight(Satelite satelite){
        if(satelite!=null){
            satelite.setWeight(500);
            System.out.println("The weight of the satelite is : "+satelite.getWeight()+" kg");
        }
        else System.out.println("satelite is pointing to null");
    }

    public void loadCapacity(Satelite[] satelites){
        if (satelites!=null){
            for (Satelite ref :satelites){
                System.out.println("The load capacity is "+ref.getLoadCapacity()+" kg");
            }
        }
    }

}
