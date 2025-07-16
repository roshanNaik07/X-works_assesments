package com.xworkz.park.associationDTO.dto;

import lombok.*;

@AllArgsConstructor
@Setter
@Getter
@EqualsAndHashCode
@ToString
public class Mayor {

    private String name;
    private int yearsInOffice;
    private String politicalParty;
    private String cityName;
    private Vehicle vehical;

}
