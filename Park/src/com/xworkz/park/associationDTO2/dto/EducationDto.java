package com.xworkz.park.associationDTO2.dto;

import lombok.*;

import java.util.List;

@AllArgsConstructor
@Setter
@Getter
@EqualsAndHashCode
@ToString

public class EducationDto {

    private String qualification;
    private String institutionName;
    private UniversityDTO universityDTO;

}
