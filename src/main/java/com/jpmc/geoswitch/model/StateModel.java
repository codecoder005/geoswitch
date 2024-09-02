package com.jpmc.geoswitch.model;

import lombok.*;

import java.util.UUID;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class StateModel {
    private UUID stateId;
    private UUID countryId;
    private String name;
}
