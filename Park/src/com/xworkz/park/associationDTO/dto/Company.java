package com.xworkz.park.associationDTO.dto;

import lombok.*;

import java.util.List;

@AllArgsConstructor
@Setter
@Getter
@EqualsAndHashCode
@ToString
public class Company {

    private String name;
    private String location;
    private String country;
    private String founder;
    private List<Owner> ownerList;

}
