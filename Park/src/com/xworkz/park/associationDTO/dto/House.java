package com.xworkz.park.associationDTO.dto;

import lombok.*;

import javax.xml.soap.Detail;

@AllArgsConstructor
@Setter
@Getter
@EqualsAndHashCode
@ToString
public class House {

    private String houseName;
    private String location;
    private String size;
    private int houseNo;
    private Details details;

}
