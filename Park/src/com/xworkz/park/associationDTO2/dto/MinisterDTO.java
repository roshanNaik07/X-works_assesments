package com.xworkz.park.associationDTO2.dto;

import lombok.*;

import java.util.List;

@AllArgsConstructor
@Setter
@Getter
@EqualsAndHashCode
@ToString

public class MinisterDTO {

    private String ministerName;
    private int age;
    private List<PortfolioDTO> portfolioDTOList;

}
