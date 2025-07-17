package com.xworkz.park.associationDTO.dto;

import lombok.*;

@AllArgsConstructor
@Setter
@Getter
@EqualsAndHashCode
@ToString
public class Registration {

    private String registrationNumber;
    private String ownerName;
    private String vehicleType;
    private String registrationDate;
    private RTO rto;

}
