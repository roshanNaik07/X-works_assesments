package com.xworkz.park.associationDTO.dto;

import lombok.*;

@AllArgsConstructor
@Setter
@Getter
@EqualsAndHashCode
@ToString
public class Product {

    private String name;
    private String type;
    private String brand;
    private int price;
    private Company company;

}
