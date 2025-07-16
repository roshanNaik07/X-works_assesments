package com.xworkz.park.associationDTO.dto;

import lombok.*;

@AllArgsConstructor
@Setter
@Getter
@EqualsAndHashCode
@ToString
public class Address {

    private String place;
    private int pincode;
    private String State;
    private String country;
    private City city;

}
