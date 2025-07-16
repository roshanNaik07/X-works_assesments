package com.xworkz.park.associationDTO.dto;

import lombok.*;

@AllArgsConstructor
@Setter
@Getter
@EqualsAndHashCode
@ToString

public class Vehicle {

    private String vehicleCompany;
    private String vehicleColor;
    private String vehicleModel;
    private int topSpeed;
    private Registration registration;

}
