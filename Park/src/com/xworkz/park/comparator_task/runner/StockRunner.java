package com.xworkz.park.comparator_task.runner;

import com.xworkz.park.comparator_task.dto.StockDTO;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class StockRunner {

    public static void main(String[] args) {

        Comparator<StockDTO> comparator = ((t1, t2) -> Integer.compare(t1.getStockCount(), t2.getStockCount()));

        List<StockDTO> list = new ArrayList<>();
        list.add(new StockDTO(200, "Kids toys"));
        list.add(new StockDTO(87, "Face wash"));
        list.add(new StockDTO(101, "Women shoes"));
        list.add(new StockDTO(55, "Chairs"));
        list.add(new StockDTO(151, "Caps"));

        System.out.println("stock count > 100 : ");

        list.stream()
                .filter(t -> t.getStockCount() > 100)
                .sorted(comparator)
                .collect(Collectors.toList()).forEach(t -> System.out.println(t));

        System.out.println();
        System.out.println("Stock count less than 100");

        list.stream()
                .filter(t -> t.getStockCount() < 100)
                .sorted(comparator)
                .collect(Collectors.toList()).forEach(t -> System.out.println(t));
    }

}
