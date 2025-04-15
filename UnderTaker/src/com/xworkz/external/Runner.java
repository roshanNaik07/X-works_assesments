package com.xworkz.external;

import com.xworkz.internal.*;

public class Runner {
    public static void main(String[] args) {

        Shoe shoe = new Puma();
        shoe.tieLace();

        System.out.println("---------------------------");
        SoftDrink softDrink = new Pepsi();
        softDrink.openBottle();

        System.out.println();
        System.out.println("---------------------------");

        FaceWash faceWash = new Garnier();
        faceWash.useFaceWash();
        faceWash.buy();

        System.out.println();
        System.out.println("---------------------------");

        Phone phone= new Mi("Realme","Black",18000);
        phone.display();

        System.out.println();
        System.out.println("---------------------------");

        Tshirt tshirt = new UsPolo("Zudio","blue","xl",800);
        System.out.println(tshirt.toString());
        }
    }

