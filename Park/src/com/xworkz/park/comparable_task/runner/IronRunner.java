package com.xworkz.park.comparable_task.runner;

import com.xworkz.park.comparable_task.dto.IronDTO;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class IronRunner {

    public static void main(String[] args) {


        List<IronDTO> list = new ArrayList<>();

        list.add(new IronDTO(56, "Ajanta", "White"));
        list.add(new IronDTO(16, "Usha", "Purple"));
        list.add(new IronDTO(25, "V-guard", "White"));
        list.add(new IronDTO(14, "Bajaj", "Gray"));

        System.out.println("Before sorting");
        list.forEach(System.out::println);

        System.out.println();
        System.out.println("After sorting");
        list.stream().sorted().forEach(System.out::println);

    }

}
