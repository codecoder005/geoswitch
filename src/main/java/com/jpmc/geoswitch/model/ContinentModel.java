package com.jpmc.geoswitch.model;

import lombok.*;

import java.util.UUID;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class ContinentModel {
    private UUID continentId;
    private String name;
}
