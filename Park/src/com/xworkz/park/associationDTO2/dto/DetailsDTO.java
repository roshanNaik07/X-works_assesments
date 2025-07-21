package com.xworkz.park.associationDTO2.dto;

import lombok.*;

import java.util.List;

@AllArgsConstructor
@Setter
@Getter
@EqualsAndHashCode
@ToString

public class DetailsDTO {

    private int staffId;
    private long contactNumber;
    private EducationDto education;

}
