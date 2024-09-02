package com.jpmc.geoswitch.model;

import lombok.*;

import java.util.UUID;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class FeatureModel {
    private UUID featureId;
    private UUID applicationId;

    private String name;
    private String description;

    private Boolean enabled;
}
