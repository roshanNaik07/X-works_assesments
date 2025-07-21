package com.xworkz.park.Map.convertMap;

import java.util.*;

public class Shoe {

    public static void main(String[] args) {

        Map<String,Boolean> map = new HashMap<>();
        map.put("red",false);
        map.put("white",true);
        map.put("black",true);
        map.put("blue",false);
        map.put("gray",true);

        Set<Map.Entry<String,Boolean>> set = new HashSet<>(map.entrySet());

        Iterator iterator = set.iterator();
        System.out.println("Shoe colors available :");
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }

    }
}
