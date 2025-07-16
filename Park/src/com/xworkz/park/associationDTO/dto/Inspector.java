package com.xworkz.park.associationDTO.dto;

import lombok.*;

import java.util.List;

@AllArgsConstructor
@Setter
@Getter
@EqualsAndHashCode
@ToString
public class Inspector {

    private String inspectorName;
    private int badgeNumber;
    private String assignedRegion;
    private int yearsOfExperience;
    private List<Experience> experienceList;

}
