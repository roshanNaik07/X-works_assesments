package com.xworkz.park.associationDTO.dto;

import lombok.*;

@AllArgsConstructor
@Setter
@Getter
@EqualsAndHashCode
@ToString

public class Government {

    private String governmentType;
    private String country;
    private String headOfGovernment;
    private int numberOfMinistries;
    private PrimeMinister primeMinister;

}
