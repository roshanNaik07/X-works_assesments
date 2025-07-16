package com.xworkz.park.associationDTO.dto;

import lombok.*;

@AllArgsConstructor
@Setter
@Getter
@EqualsAndHashCode
@ToString
public class Constituency {

    private String constituencyName;
    private String constituencyState;
    private int totalVoters;
    private String mpSince;
    private Ward ward;

}
