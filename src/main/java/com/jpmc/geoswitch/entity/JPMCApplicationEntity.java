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
@Table(name = "application")
public class JPMCApplicationEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID applicationId;
    private Long sealId;
    private String name;
    private String description;
    private String version;
}
