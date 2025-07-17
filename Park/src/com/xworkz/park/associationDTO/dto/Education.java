package com.xworkz.park.associationDTO.dto;

import lombok.*;

@AllArgsConstructor
@Setter
@Getter
@EqualsAndHashCode
@ToString
public class Education {

    private String qualification;
    private String board;
    private int graduationYear;
    private double percentage;
    private University university;

}
