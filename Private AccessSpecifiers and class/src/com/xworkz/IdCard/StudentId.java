package com.xworkz.IdCard;

import com.xworkz.Satelite.Satelite;

public class StudentId {

    public void idMaterial(){
        IdCard idCard = new IdCard();
        idCard.setMaterial("plastic");
        System.out.println("The material type is : "+idCard.getMaterial());
    }

    public void idColors(){
        String[] colors ={"white","Blue"};
            for (String color : colors){

                IdCard idCard = new IdCard();
                idCard.setColors(colors);
                System.out.println("Colors are : "+idCard.getColors());
            }


    }

}
