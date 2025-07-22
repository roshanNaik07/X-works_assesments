package com.xworkz.park.comparable_task.dto;

import lombok.*;

@AllArgsConstructor
@Setter
@Getter
@EqualsAndHashCode
@ToString

public class RetailShopDTO implements Comparable<RetailShopDTO>{

    private int productCount;
    private String productName;

    @Override
    public int compareTo(RetailShopDTO o) {
        return Integer.compare(this.productCount,o.productCount);
    }

}
