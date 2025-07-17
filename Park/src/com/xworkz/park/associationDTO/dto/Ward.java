package com.xworkz.park.associationDTO.dto;

import lombok.*;

@AllArgsConstructor
@Setter
@Getter
@EqualsAndHashCode
@ToString
public class Ward {

    private int wardNumber;
    private String wardName;
    private String zone;
    private String city;

}
