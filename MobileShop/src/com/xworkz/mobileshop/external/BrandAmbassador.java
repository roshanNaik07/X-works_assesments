package com.xworkz.mobileshop.external;

import com.xworkz.mobileshop.dto.BrandAmbassadorDTO;

import java.util.ArrayList;
import java.util.Collection;

public class BrandAmbassador {

    public static void main(String[] args) {

        Collection<BrandAmbassadorDTO> collection = new ArrayList<>();

        collection.add(new BrandAmbassadorDTO("Puma", "Virat Kohli", 12500000));
        collection.add(new BrandAmbassadorDTO("Pepsi", "Salman Khan", 15000000));
        collection.add(new BrandAmbassadorDTO("Samsung", "Alia Bhatt", 8000000));
        collection.add(new BrandAmbassadorDTO("Oppo", "Varun Dhawan", 5500000));
        collection.add(new BrandAmbassadorDTO("Nike", "Cristiano Ronaldo", 25000000));
        collection.add(new BrandAmbassadorDTO("Reebok", "Katrina Kaif", 7000000));
        collection.add(new BrandAmbassadorDTO("OnePlus", "Robert Downey Jr.", 10000000));
        collection.add(new BrandAmbassadorDTO("Colgate", "Ranveer Singh", 6000000));
        collection.add(new BrandAmbassadorDTO("Lays", "MS Dhoni", 4500000));
        collection.add(new BrandAmbassadorDTO("Adidas", "Lionel Messi", 20000000));

        System.out.println("Size of the collection before clearing : "+collection.size());

        for (BrandAmbassadorDTO ref : collection){
            System.out.println("Brand : "+ref.getBrand()+" | Ambassador : "+ref.getAmbassadorName()+" | Promotion amount : "+ref.getAmountPaid());
        }

        collection.clear();
        System.out.println("Size after clearing the data from the collection : "+ collection.size());

    }
}
