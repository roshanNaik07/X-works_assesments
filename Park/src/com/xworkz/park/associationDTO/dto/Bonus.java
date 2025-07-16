package com.xworkz.park.associationDTO.dto;

import lombok.*;

@AllArgsConstructor
@Setter
@Getter
@EqualsAndHashCode
@ToString

public class Bonus {

    private String bonusType;
    private double amount;
    private String eligibleRole;
    private String issuedDate;
    private Tax tax;

}
