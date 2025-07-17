package com.xworkz.park.associationDTO.dto;

import lombok.*;

@AllArgsConstructor
@Setter
@Getter
@EqualsAndHashCode
@ToString

public class PrimeMinister {

    private String PrimeMinisterName;
    private int PrimeMinisterAge;
    private String politicalParty;
    private int termYears;
    private Constituency constituency;

}
