package com.xworkz.park.associationDTO.dto;

import lombok.*;

@AllArgsConstructor
@Setter
@Getter
@EqualsAndHashCode
@ToString

public class City {

    private String cityName;
    private String cityState;
    private double areaInSqKm;
    private int population;
    private Information information;

}
