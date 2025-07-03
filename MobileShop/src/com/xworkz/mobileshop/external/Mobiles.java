package com.xworkz.mobileshop.external;

import com.xworkz.mobileshop.dto.MobileDTO;

import java.util.ArrayList;
import java.util.Collection;

public class Mobiles{

    public static void main(String[]args){

        Collection<MobileDTO> collection = new ArrayList<>();

        collection.add(new MobileDTO("Iphone 15",100000,"online/offine"));
        collection.add(new MobileDTO("Samsung A3",45000,"offline"));
        collection.add(new MobileDTO("MI note pro 5G",30000,"online/offline"));
        collection.add(new MobileDTO("Motrola edge",35000,"online"));
        collection.add(new MobileDTO("Vivo v6",23000,"online"));
        collection.add(new MobileDTO("Nokia",45000,"Online"));
        collection.add(new MobileDTO("Oppo f7",20000,"offline"));
        collection.add(new MobileDTO("Realme Narzo",16000,"Online"));
        collection.add(new MobileDTO("Nothing 5",30000,"Online"));
        collection.add(new MobileDTO("Iqoo Z3",22000,"Online"));

        System.out.println(collection.size());

        for (MobileDTO ref : collection){
            System.out.println("Brand : " +ref.getBrand()+"| Price: "+ref.getPrice()+" | Availability : "+ref.getAvailability());
        }

        collection.clear();
        System.out.println("After clearing the collection size is : " + collection.size());
    }

}
