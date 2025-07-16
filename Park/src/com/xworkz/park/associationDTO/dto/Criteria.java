package com.xworkz.park.associationDTO.dto;

import lombok.*;

@AllArgsConstructor
@Setter
@Getter
@EqualsAndHashCode
@ToString

public class Criteria {

    private String criteriaName;
    private String description;
    private boolean isMandatory;
    private int minimumScore;
    private SalaryExpectation salaryExpectation;

}
