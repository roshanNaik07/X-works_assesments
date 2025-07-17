package com.xworkz.park.associationDTO.dto;

import lombok.*;

@AllArgsConstructor
@Setter
@Getter
@EqualsAndHashCode
@ToString
public class RTO {

    private String rtoCode;
    private String rtoLocation;
    private String officerInCharge;
    private int numberOfEmployees;
    private Inspector inspector;

}
