package com.xworkz.park.comparable_task.runner;

import com.xworkz.park.comparable_task.dto.BagDTO;
import com.xworkz.park.comparable_task.dto.RetailShopDTO;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class RetailShopRunner {

    public static void main(String[] args) {

        List<RetailShopDTO> list = new ArrayList<>();
        list.add(new RetailShopDTO(260,"Shampoo"));
        list.add(new RetailShopDTO(45,"Face wash"));
        list.add(new RetailShopDTO(122,"Body lotion"));
        list.add(new RetailShopDTO(155,"Liquid soap"));
        list.add(new RetailShopDTO(18,"Stain remover"));
        list.add(new RetailShopDTO(600,"Soap"));
        list.add(new RetailShopDTO(55,"Brush"));

        list.stream().filter(t->t.getProductCount()>100).sorted().forEach(System.out::println);

    }

}
