package com.xworkz.park.comparator_task.runner;

import com.xworkz.park.comparator_task.dto.ShoeSizeDTO;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ShoeSizeRunner {

    public static void main(String[] args) {

        Comparator<ShoeSizeDTO> comparator = ((t1,t2) -> Integer.compare(t2.getShoeNo(), t1.getShoeNo() ));

        List<ShoeSizeDTO> list = new ArrayList<>();

        list.add(new ShoeSizeDTO(7,"puma"));
        list.add(new ShoeSizeDTO(1,"Adidas"));
        list.add(new ShoeSizeDTO(5,"Asian"));

        list.forEach(t -> System.out.println(t));

        System.out.println();

        System.out.println("Desceneding order");

        Collections.sort(list,comparator);
        list.forEach(t -> System.out.println(t));
    }

}
