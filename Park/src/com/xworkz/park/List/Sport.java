package com.xworkz.park.List;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.ListIterator;

public class Sport {

    public static void main(String[] args) {

        List<String> list = new ArrayList<>(Arrays.asList("VolleyBall","Kabaddi","Basket Ball","Throw Ball"));

        ListIterator<String> iterator = list.listIterator();

        List<Integer> list1 = new ArrayList<>(Arrays.asList(100,200,300,400,500));
        ListIterator<Integer> integerListIterator = list1.listIterator();

        System.out.println("Sport names");
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }

        System.out.println( );
        System.out.println("Printing all the values in the list : ");

        while (integerListIterator.hasNext()){
            System.out.println(integerListIterator.next());
        }

    }

}
