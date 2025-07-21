package com.xworkz.park.associationDTO2.dto;

import lombok.*;

import java.util.List;

@AllArgsConstructor
@Setter
@Getter
@EqualsAndHashCode
@ToString

public class StateDTO {

    private String stateName;
    private int statePopulation;
    private String stateCM;
    private List<MinisterDTO> ministerDTOList;

}
