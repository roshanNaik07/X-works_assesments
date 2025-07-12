package com.xworkz.park.Set;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;
import java.util.stream.Collectors;

public class ClothingBrand {

    public static void main(String[] args) {

        System.out.println("Listing the names in the set");
        Set<String> clothSet = new HashSet<>(Arrays.asList("PUMA", "US polo", "Adidas", "LV", "PUMA"));

        clothSet.forEach(t -> System.out.println(t));

        System.out.println("Listing the names in the set in a alphabetical order :");
        Set<String> clothSet1 = new TreeSet<>(Arrays.asList("PUMA", "US polo", "Adidas", "LV", "PUMA"));
        clothSet1.forEach(t -> System.out.println(t));

    }
}
