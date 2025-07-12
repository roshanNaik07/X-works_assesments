package com.xworkz.park.Set;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class ShoeBrand {

    public static void main(String[] args) {

        Set<ShoeDTO> set = new HashSet<>();

        set.add(new ShoeDTO("Puma",5000,8));
        set.add(new ShoeDTO("Adidas",4500,9));
        set.add(new ShoeDTO("Red Tape",3000,7));
        set.add(new ShoeDTO("Puma",5000,8));

        Iterator<ShoeDTO> iterator = set.iterator();

        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }

        System.out.println();
        System.out.println("Printing dto in the list using lamda expression");
        set.forEach(t-> System.out.println(t));
    }
}
