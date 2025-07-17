package com.xworkz.park.associationDTO.dto;

import lombok.*;

@AllArgsConstructor
@Setter
@Getter
@EqualsAndHashCode
@ToString
public class Experience {

    private String field;
    private int years;
    private String organizationName;
    private String role;
    private Education education;

}
