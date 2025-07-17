package com.xworkz.park.associationDTO.dto;

import lombok.*;

@AllArgsConstructor
@Setter
@Getter
@EqualsAndHashCode
@ToString
public class Designation {

    private String title;
    private String department;
    private String level;
    private double salary;
    private Role Role;

}
