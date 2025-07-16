package com.xworkz.park.Map.internal;


import lombok.*;

@AllArgsConstructor
@Setter
@Getter
@EqualsAndHashCode
@ToString

public class BagDTO {

    private String Color;
    private int price;
    private String Size;
    private int noOfZip;
    private int noOfSections;
    private int warrenty;

}
