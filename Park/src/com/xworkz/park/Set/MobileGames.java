package com.xworkz.park.Set;

import java.util.*;
import java.util.stream.Collectors;

public class MobileGames {

    public static void main(String[] args) {

        Collection<Integer> c = new ArrayList<>(Arrays.asList(100,200,300,400,500,100));


        Iterator<Integer> iterator = c.iterator();

        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }

        System.out.println("to avoid duplicates from the collections we can use set ");

        Set<Integer> noDuplicates = new TreeSet<>(c);
        //Tree set will not disturb the order
        Iterator<Integer> iterator1 = noDuplicates.iterator();
        while (iterator1.hasNext()){
            System.out.println(iterator1.next());
        }

        //or we can do like
        System.out.println("Another way of collecting the collections in the set to avoid duplicates");


        Iterator<Integer> iterator2 = c.stream().collect(Collectors.toSet()).iterator();

        while (iterator2.hasNext()){
            System.out.println(iterator2.next());
        }

        System.out.println("Using lamda expression");

        c.stream().collect(Collectors.toSet()).forEach(T-> System.out.println(T));
    }

}
