package com.xworkz.park.collection.external;


import lombok.*;

@AllArgsConstructor
@EqualsAndHashCode
@Setter
@Getter
@ToString
public class CountryDTO {

    private String name;
    private int pinCode;
    private int populationInMillions;
    private int noOfStates;
    private int massInSqKms;
    private String primeMinister;
    private String primaryLang;
    private String secondaryLang;
    private String gdp ;

}
