package com.xworkz.park.Map.convertMap;

import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Map;

public class MovieRunner {

    public static void main(String[] args) {

        Map<String,String> map = new HashMap<>();
        map.put("KGF","Yash");
        map.put("Bahubali","Prabhas");
        map.put("Toxic","Yash");
        map.put("Charlie 777","Rakshith");
        map.put("Openheimer","Cilen Murphy");

        LinkedList<Map.Entry<String,String>> list = new LinkedList<>(map.entrySet());

        Iterator iterator = list.iterator();

        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }

    }

}
