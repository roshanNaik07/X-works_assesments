package com.xworkz.park.associationDTO.dto;

import lombok.*;

import java.util.List;

@AllArgsConstructor
@Setter
@Getter
@EqualsAndHashCode
@ToString

public class Role {

    private String roleName;
    private String responsibilities;
    private String reportingTo;
    private boolean isLeadershipRole;
    private List<Criteria> criteriaList;

}
