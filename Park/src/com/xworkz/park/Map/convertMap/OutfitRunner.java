package com.xworkz.park.Map.convertMap;

import java.util.*;

public class OutfitRunner {

    public static void main(String[] args) {

        Map<String,Integer> map = new HashMap<>();
        map.put("Snitch",1500);
        map.put("puma",2000);
        map.put("CK",1800);
        map.put("Louis Phillip",2500);

        Set<Map.Entry<String,Integer>> set = new HashSet<>(map.entrySet());

        System.out.println("brand and price");
        Iterator iterator = set.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }

    }

}
