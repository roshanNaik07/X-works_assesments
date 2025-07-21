package com.xworkz.park.associationDTO2.dto;

import lombok.*;

import java.util.List;

@AllArgsConstructor
@Setter
@Getter
@EqualsAndHashCode
@ToString
public class UniversityDTO {

    private String universityName;
    private String universityFounder;
    private ChancellorDTO chancellor;

}
