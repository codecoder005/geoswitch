package com.jpmc.geoswitch.entity;

import jakarta.persistence.*;
import lombok.*;

import java.util.UUID;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity
@Table(name = "feature")
public class FeatureEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID featureId;
    private UUID applicationId;

    private String name;
    private String description;

    private Boolean enabled;
}
