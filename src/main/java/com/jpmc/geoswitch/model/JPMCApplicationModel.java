package com.jpmc.geoswitch.model;

import lombok.*;

import java.util.UUID;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class JPMCApplicationModel {
    private UUID applicationId;
    private Long sealId;
    private String name;
    private String description;
    private String version;
}
