package com.jpmc.geoswitch.model;

import lombok.*;

import java.util.UUID;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class CountryModel {
    private UUID countryId;
    private UUID continentId;
    private String name;
}
