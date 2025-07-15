package com.xworkz.park.Map.external;

import com.xworkz.park.Map.internal.TrainDTO;

import java.util.HashMap;
import java.util.Map;

public class TrainRunner {

    public static void main(String[] args) {

        TrainDTO trainDTO = new TrainDTO("KSR","KSR","Mysore",50,"General","8 pm",1);
        TrainDTO trainDTO1 = new TrainDTO("Mangalore Central","Mangalore","Kumta",240,"General","2 pm",2);
        TrainDTO trainDTO2 = new TrainDTO("Hubli","Hubli","Goa",300,"AC","5 pm",1);
        TrainDTO trainDTO3 = new TrainDTO("Kerala","kerala","Mangalore",60,"General","8 pm",1);

        Map<String,TrainDTO> map = new HashMap<>();

        map.put("KSR express",trainDTO);
        map.put("Madgoan express",trainDTO1);
        map.put("Netravathi express",trainDTO2);
        map.put("Vande Mataram",trainDTO3);

        for (Map.Entry<String,TrainDTO> entry : map.entrySet()){

            System.out.println("Train Name : " + entry.getKey() + " | Details : " + entry.getValue());
        }

    }

}
