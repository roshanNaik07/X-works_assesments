package com.xworkz.park.comparable_task.dto;

import lombok.*;

@AllArgsConstructor
@Setter
@Getter
@EqualsAndHashCode
@ToString

public class BagDTO implements Comparable<BagDTO> {

    private int bagNumber;
    private String bagBrand;

    @Override
    public int compareTo(BagDTO o) {
        return Integer.compare(o.bagNumber, this.bagNumber);
    }

}
