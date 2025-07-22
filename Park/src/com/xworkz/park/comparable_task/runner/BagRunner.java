package com.xworkz.park.comparable_task.runner;

import com.xworkz.park.comparable_task.dto.BagDTO;

import java.util.ArrayList;
import java.util.List;

public class BagRunner {

    public static void main(String[] args) {

        List<BagDTO> list = new ArrayList<>();
        list.add(new BagDTO(26,"wild craft"));
        list.add(new BagDTO(41,"puma"));
        list.add(new BagDTO(42,"Arctic fox"));
        list.add(new BagDTO(1,"American Tourist"));

        System.out.println("Before sorting");

        list.forEach(System.out::println);

        System.out.println();;
        System.out.println("After sorting in descending order");

        list.stream().sorted().forEach(System.out::println);

    }
}
