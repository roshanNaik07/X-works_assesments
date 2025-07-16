package com.xworkz.park.associationDTO.dto;

import lombok.*;

@AllArgsConstructor
@Setter
@Getter
@EqualsAndHashCode
@ToString
public class University {

    private String universityName;
    private String universityLocation;
    private int UniversityEstablishedYear;
    private int numberOfStudents;
    private President president;

}
