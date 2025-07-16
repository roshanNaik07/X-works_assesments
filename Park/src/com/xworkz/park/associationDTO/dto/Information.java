package com.xworkz.park.associationDTO.dto;

import lombok.*;

@AllArgsConstructor
@Setter
@Getter
@EqualsAndHashCode
@ToString
public class Information {

    private String famousFor;
    private int numberOfTouristPlaces;
    private String localLanguage;
    private boolean hasAirport;
    private Mayor mayor;

}
