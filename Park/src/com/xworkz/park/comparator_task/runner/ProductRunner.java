package com.xworkz.park.comparator_task.runner;

import com.xworkz.park.comparator_task.dto.ProductDTO;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ProductRunner {

    public static void main(String[] args) {

        Comparator<ProductDTO> comparator = ((p1,p2) -> Integer.compare(p1.getId(), p2.getId()));
        List<ProductDTO> productDTOList = new ArrayList<>();
        productDTOList.add(new ProductDTO(21, "Laptop"));
        productDTOList.add(new ProductDTO(1, "Battery"));
        productDTOList.add(new ProductDTO(15, "Keyboard"));

        productDTOList.forEach(t -> System.out.println(t));

        System.out.println();

        Collections.sort(productDTOList, comparator);
        productDTOList.forEach(t -> System.out.println(t));

    }

}
