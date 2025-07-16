package com.xworkz.park.Map.external;

import com.xworkz.park.Map.internal.BagDTO;

import java.util.HashMap;
import java.util.Map;

public class BagRunner {

    public static void main(String[] args) {

        BagDTO bagDTO = new BagDTO("Black",1000,"large",3,6,2);
        BagDTO bagDTO1 = new BagDTO("Gray",1200,"Medium",5,5,1);
        BagDTO bagDTO2 = new BagDTO("Red",2000,"large",4,6,2);
        BagDTO bagDTO3 = new BagDTO("Blue",1000,"Small",2,4,1);

        Map<String,BagDTO> map = new HashMap<>();

        map.put("American Tourist",bagDTO);
        map.put("Acrtic Fox",bagDTO1);
        map.put("WildCraft",bagDTO2);
        map.put("SkyBags",bagDTO3);

        for (Map.Entry<String,BagDTO> entry : map.entrySet()){

            System.out.println("Brand : " + entry.getKey() + " | Details : " + entry.getValue());

        }

    }

}
