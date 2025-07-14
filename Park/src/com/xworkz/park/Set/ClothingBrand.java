package com.xworkz.park.Set;

import java.util.*;
import java.util.stream.Collectors;

public class ClothingBrand {

    public static void main(String[] args) {

        System.out.println("Listing the names in the set");
        Set<String> clothSet = new HashSet<>(Arrays.asList("PUMA", "US polo", "Adidas", "LV", "PUMA"));

        clothSet.forEach(t -> System.out.println(t));

        System.out.println("Listing the names in the set in a alphabetical order :");
        Set<String> clothSet1 = new TreeSet<>(Arrays.asList("PUMA", "US polo", "Adidas", "LV", "PUMA"));

        Iterator<String> iterator = clothSet1.iterator();

        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }

    }
}
