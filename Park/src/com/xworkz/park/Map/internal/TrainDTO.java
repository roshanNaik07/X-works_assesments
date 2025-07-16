package com.xworkz.park.Map.internal;

import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@EqualsAndHashCode
@ToString
public class TrainDTO {

    private String stationName;
    private String source;
    private String destination;
    private int ticketPrice;
    private String coach ;
    private String timing;
    private int noOfPassangers;

}
