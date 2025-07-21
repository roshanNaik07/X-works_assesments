package com.xworkz.park.associationDTO2.dto;

import lombok.*;

import java.util.List;

@AllArgsConstructor
@Setter
@Getter
@EqualsAndHashCode
@ToString

public class PortfolioDTO {

    private String portfolioName;
    private int yearsInCharge;
    private DepartmentDTO departmentDTO;

}
