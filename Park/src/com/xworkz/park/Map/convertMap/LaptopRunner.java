package com.xworkz.park.Map.convertMap;

import java.util.*;

public class LaptopRunner {

    public static void main(String[] args) {

        Map<String,Integer> map = new HashMap<>();
        map.put("Acer",60000);
        map.put("Asus",80000);
        map.put("Lenovo",45000);
        map.put("Hp",75000);
        map.put("Samsung book",80000);
        map.put("Mac",130000);

        List<Map.Entry<String,Integer>> list = new ArrayList<>(map.entrySet());

        for (Map.Entry<String,Integer> ref : list){
            System.out.println(ref.getKey() +" | price = "+ ref.getValue());
        }

    }
}
