package com.xworkz.park.Map.external;

import java.util.HashMap;
import java.util.Map;

public class USN {

    public static void main(String[] args) {

        Map<String ,String> map= new HashMap<>();
        map.put("Roshan","4sh21cs114");
        map.put("arjun","4sh21cs234");
        map.put("adhitya","4sh21cs111");

        System.out.println(map.get("Roshan"));
        System.out.println(map.get("arjun"));
        System.out.println(map.get("mahesh"));

    }

}
