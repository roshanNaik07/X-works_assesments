package com.xworkz.park.associationDTO2.dto;

import lombok.*;

import java.util.List;

@AllArgsConstructor
@Setter
@Getter
@EqualsAndHashCode
@ToString

public class DepartmentDTO {

    private String departmentName ;
    private String departmentLocation;
    private HeadOfDepartment headOfDepartment;


}
