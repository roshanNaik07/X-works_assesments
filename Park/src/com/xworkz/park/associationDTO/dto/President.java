package com.xworkz.park.associationDTO.dto;

import lombok.*;

@AllArgsConstructor
@Setter
@Getter
@EqualsAndHashCode
@ToString

public class President {

    private String presidentName;
    private int presidentAge;
    private String termStartDate;
    private String previousExperience;
    private Designation designation;

}
