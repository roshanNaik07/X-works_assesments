package com.xworkz.mobileshop.external;

import com.xworkz.mobileshop.dto.BrandDTO;
import com.xworkz.mobileshop.dto.MobileDTO;

import java.util.ArrayList;
import java.util.Collection;

public class MobileBrands {

    public static void main(String[] args) {

        Collection<BrandDTO> collection = new ArrayList<>();

        collection.add(new BrandDTO("Apple", "Cupertino, USA", 164000));
        collection.add(new BrandDTO("Samsung", "Suwon, South Korea", 266673));
        collection.add(new BrandDTO("Xiaomi", "Beijing, China", 32000));
        collection.add(new BrandDTO("Motorola", "Chicago, USA", 6000));
        collection.add(new BrandDTO("Vivo", "Dongguan, China", 10000));
        collection.add(new BrandDTO("Nokia", "Espoo, Finland", 87000));
        collection.add(new BrandDTO("Oppo", "Dongguan, China", 40000));
        collection.add(new BrandDTO("Realme", "Shenzhen, China", 15000));
        collection.add(new BrandDTO("Nothing", "London, UK", 500));
        collection.add(new BrandDTO("Iqoo", "Dongguan, China", 8000));

        System.out.println("Collection size : " +collection.size());

        for (BrandDTO ref : collection){
            System.out.println("Brand: "+ref.getBrandName()+" | Located : "+ref.getLocation()+" | number of emp : "+ref.getNoOfEmployees());
        }

        System.out.println("Clearing the Collection data");
        collection.clear();
        System.out.println("Size after clearing the data : "+collection.size());
    }
}
