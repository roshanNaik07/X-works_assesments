package com.xworkz.park.associationDTO2.dto;

import lombok.*;
import java.util.List;

@AllArgsConstructor
@Setter
@Getter
@EqualsAndHashCode
@ToString

public class HeadOfDepartment {

    private int experienceYears;
    private String officeLocation;
    private List<StaffDTO> staffDTOList;

}
