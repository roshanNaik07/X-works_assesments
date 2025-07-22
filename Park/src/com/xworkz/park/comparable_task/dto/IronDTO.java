package com.xworkz.park.comparable_task.dto;

import lombok.*;

@AllArgsConstructor
@Setter
@Getter
@EqualsAndHashCode
@ToString

public class IronDTO implements Comparable<IronDTO> {

    private int modelNumber;
    private String modelName;
    private String color;

    @Override
    public int compareTo(IronDTO o) {
        if (this.modelNumber > o.modelNumber) {
            return 1;
        } else if (this.modelNumber == o.modelNumber) {
            return 0;
        } else
            return -1;
    }
}
