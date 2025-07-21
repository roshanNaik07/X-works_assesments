package com.xworkz.park.associationDTO2.dto;


import lombok.*;

import java.util.List;

@AllArgsConstructor
@Setter
@Getter
@EqualsAndHashCode
@ToString

public class StaffDTO {

    private String staffName;
    private String designation;
    private DetailsDTO details;

}
