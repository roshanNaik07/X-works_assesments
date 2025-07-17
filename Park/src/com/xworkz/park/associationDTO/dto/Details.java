package com.xworkz.park.associationDTO.dto;

import lombok.*;

@AllArgsConstructor
@Setter
@Getter
@EqualsAndHashCode
@ToString
public class Details {

    private String color;
    private String nearBy ;
    private int noOfFloors;
    private String design ;
    private Address address;

}
