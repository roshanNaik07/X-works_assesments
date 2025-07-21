package com.xworkz.park.Map.convertMap;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class BmtcRunner {

    public static void main(String[] args) {


        Map<Integer,String> map = new HashMap<>();
        map.put(176,"Hampinagar");
        map.put(60,"Chandra Layout");
        map.put(401,"Rajajinagar");
        map.put(248,"Mejestic");
        map.put(238,"navrang");

        ArrayList<Map.Entry<Integer,String>> arrayList = new ArrayList<>(map.entrySet());

        Iterator iterator = arrayList.iterator();;

        System.out.println("Bus No and their route : ");

        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }

    }

}
