package com.xworkz.park.associationDTO.dto;

import lombok.*;

@AllArgsConstructor
@Setter
@Getter
@EqualsAndHashCode
@ToString

public class SalaryExpectation {

    private String candidateName;
    private String desiredRole;
    private double expectedSalary;
    private String currency;
    private Bonus bonus;

}
