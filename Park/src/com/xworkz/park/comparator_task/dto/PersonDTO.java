package com.xworkz.park.comparator_task.dto;

import lombok.*;

import java.time.LocalDate;

@AllArgsConstructor
@Setter
@Getter
@EqualsAndHashCode
@ToString

public class PersonDTO {

    private String personName;
    private String email;
    private long phoneNo;
    private LocalDate date;

}
