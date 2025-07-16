package com.xworkz.park.Map.external;

import java.util.HashMap;
import java.util.Map;

public class Shoe {

    public static void main(String[] args) {

        Map<String,Integer> map = new HashMap<>();
        map.put("Adidas",5000);
        map.put("Puma",2500);
        map.put("RedTape",800);
        map.put("Sparks",1200);
        map.put("Bata",800);

        for (Map.Entry<String,Integer> entry : map.entrySet()){

            System.out.println("Brand = " +entry.getKey() + "," + " Price = " + entry.getValue());

        }

    }

}
