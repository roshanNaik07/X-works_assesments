package com.xworkz.park.List;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.ListIterator;

public class ParkDetail{

    public static void main(String[] args) {

        List<ParkDTO> list = new ArrayList<>(Arrays.asList());
        list.add(new ParkDTO("lalBhag Park","lal bhag",200));
        list.add(new ParkDTO("Kadri park","park",50));
        list.add(new ParkDTO("lalBhag Park","lal bhag",200));

        ListIterator<ParkDTO> iterator = list.listIterator();

        while (iterator.hasNext()){

            System.out.println(iterator.next());

        }

    }

}
