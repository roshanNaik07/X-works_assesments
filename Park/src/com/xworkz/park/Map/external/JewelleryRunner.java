package com.xworkz.park.Map.external;

import com.xworkz.park.Map.internal.JewelleryDTO;

import java.util.HashMap;
import java.util.Map;

public class JewelleryRunner {

    public static void main(String[] args) {

        Map <String, JewelleryDTO> map = new HashMap<>() ;

        JewelleryDTO jewelleryDTO = new JewelleryDTO("Gold Chain",20000,"5 carat","Lakshmi Jewels",9500);
        JewelleryDTO jewelleryDTO1 = new JewelleryDTO("Silver bracelet",2000,"50 gm","Maruthi jewellery",1200);
        JewelleryDTO jewelleryDTO2 = new JewelleryDTO("Platinum bracelet",4000,"5gm coated","lakshmi jewels",5000);
        JewelleryDTO jewelleryDTO3 = new JewelleryDTO("Copper Glass",1500 ,"250 gm","Maruthi jewellery",1000);
        JewelleryDTO jewelleryDTO4 = new JewelleryDTO("Roll Gold",3000,"gold and copper mix ","Suhas jewellery",0);

        map.put("Gold",jewelleryDTO);
        map.put("Silver",jewelleryDTO1);
        map.put("Platinum",jewelleryDTO2);
        map.put("Copper",jewelleryDTO3);
        map.put("Roll gold",jewelleryDTO4);

        System.out.println("Get details of gold = " + map.get("Gold"));

        System.out.println();

        for (Map.Entry<String,JewelleryDTO> entry : map.entrySet()){

            System.out.println("Material : " + entry.getKey() + " | Details : " + entry.getValue());

        }

    }

}
