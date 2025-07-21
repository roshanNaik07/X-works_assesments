package com.xworkz.park.Map.convertMap;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class TrainingRunner {

    public static void main(String[] args) {

        Map<String,TrainingDTO> map = new HashMap<>();

        map.put("Xworkz",new TrainingDTO("BTM","FSD",15000,3));
        map.put("QSpiders",new TrainingDTO("Rajajinagar","FSD",25000,4));
        map.put("kodnest",new TrainingDTO("BTM","Data Analyst",25000,5));
        map.put("Code Labs",new TrainingDTO("Rajajinagar","FSD",10000,2));

        List<Map.Entry<String,TrainingDTO>> list = new ArrayList<>(map.entrySet());

        for (Map.Entry<String,TrainingDTO> entry : list){
            System.out.println(entry.getKey() + " | details : " + entry.getValue());
        }

    }
}
