package com.xworkz.park.Map.convertMap;

import lombok.*;

@AllArgsConstructor
@Setter@Getter
@EqualsAndHashCode
@ToString
public class TrainingDTO {

    private String location;
    private String topic;
    private int fees;
    private int period;

}
