package com.xworkz.park.associationDTO.dto;

import lombok.*;

import java.util.List;

@AllArgsConstructor
@Setter
@Getter
@EqualsAndHashCode
@ToString
public class Owner {

    private String name;
    private int age;
    private String email;
    private long phNo;
    private List<House> houseList;

}
