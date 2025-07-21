package com.xworkz.park.application.runner;

import com.xworkz.park.application.dto.ApplicationDto;

import java.util.*;

public class ApplicationRunner {
    public static void main(String[] args) {

        Comparator<ApplicationDto> comparator = ((p1,p2)->Double.compare(p2.getVersion(),p1.getVersion()));


        List<ApplicationDto> list = new ArrayList<>();

        list.add(new ApplicationDto(1.2, "icic"));
        list.add(new ApplicationDto(1.1, "Hdfc"));
        list.add(new ApplicationDto(1.1, "karnatakaBank"));

        list.forEach(n -> System.out.println(n));
        Collections.sort(list);
        System.out.println("--------------------------");
        list.forEach(n -> System.out.println(n));
    }


}
