package com.xworkz.park.associationDTO.dto;

import lombok.*;

@AllArgsConstructor
@Setter
@Getter
@EqualsAndHashCode
@ToString

public class Tax {

    private String taxType;
    private double taxAmount;
    private String applicableFor;
    private String financialYear;
    private Government government;

}
